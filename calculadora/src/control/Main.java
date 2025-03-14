package control;

import model.Aluno;
class Main {
    /**
     * variavel.
     */
    private static final double NOTA_AP1_JOAO = 10;
    /**
     * variavel.
     */
    private static final double NOTA_AP2_JOAO = 7;
    /**
     * variavel.
     */
    private static final double NOTA_AS_JOAO = 0;

    /**
     * variavel.
     */
    private static final double NOTA_AP1_IAN = 2;
    /**
     * variavel.
     */
    private static final double NOTA_AP2_IAN = 2;
    /**
     * variavel.
     */
    private static final double NOTA_AS_IAN = 4;

    /**
     * variavel.
     */
    private static final double NOTA_AP1_BRENDA = 3;
    /**
     * variavel.
     */
    private static final double NOTA_AP2_BRENDA = 7;
    /**
     * variavel.
     */
    private static final double NOTA_AS_BRENDA = 8;

    private static void main(final String[] args) {
        Aluno aluno = new Aluno();
        aluno.calcularMedia("João", NOTA_AP1_JOAO, NOTA_AP2_JOAO, NOTA_AS_JOAO);
        aluno.calcularMedia("Ian", NOTA_AP1_IAN, NOTA_AP2_IAN, NOTA_AS_IAN);
        aluno.calcularMedia("Brenda",
                            NOTA_AP1_BRENDA,
                            NOTA_AP2_BRENDA,
                            NOTA_AS_BRENDA);
    }

}
