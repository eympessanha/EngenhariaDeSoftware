package control;

import model.Aluno;

import java.util.logging.Level;
import java.util.logging.Logger;

final class Main {

    /**
     * Logger para mensagens da aplicação.
     */
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());


    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * variavel joao.
     */
    private static final double NOTA_AP1_JOAO = 10;
    /**
     * variavel joao.
     */
    private static final double NOTA_AP2_JOAO = 7;
    /**
     * variavel joao.
     */
    private static final double NOTA_AS_JOAO = 0;

    /**
     * variavel ian.
     */
    private static final double NOTA_AP1_IAN = 2;
    /**
     * variavel ian.
     */
    private static final double NOTA_AP2_IAN = 2;
    /**
     * variavel ian.
     */
    private static final double NOTA_AS_IAN = 4;

    /**
     * variavel brenda.
     */
    private static final double NOTA_AP1_BRENDA = 3;
    /**
     * variavel brenda.
     */
    private static final double NOTA_AP2_BRENDA = 7;
    /**
     * variavel brenda.
     */
    private static final double NOTA_AS_BRENDA = 8;

    public static void main(final String[] args) {
        Aluno aluno = new Aluno();
        aluno.calcularMedia("João", NOTA_AP1_JOAO, NOTA_AP2_JOAO, NOTA_AS_JOAO);
        aluno.calcularMedia("Ian", NOTA_AP1_IAN, NOTA_AP2_IAN, NOTA_AS_IAN);
        aluno.calcularMedia("Brenda",
                            NOTA_AP1_BRENDA,
                            NOTA_AP2_BRENDA,
                            NOTA_AS_BRENDA);

        if (args.length > 0) {
            LOGGER.log(Level.INFO, "Args:{0}", String.join(", ", args));
        }
    }

}
