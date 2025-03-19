package model;

import static java.lang.Math.max;
import java.util.logging.Logger;

public class Aluno {
    /**
     * A constante que define a nota mínima necessária para aprovação.
     */
    private static final int NOTA_MINIMA = 7;

    /**
     * O Logger para exibir as mensagens.
     */
    private static final Logger LGR = Logger.getLogger(Aluno.class.getName());

    /**
     * Calcula a média do aluno e verifica se foi aprovado ou reprovado.
     * @param nome nome do aluno.
     * @param ap1 nota da ap1.
     * @param ap2 nota da ap2.
     * @param as nota da as.
     *
     *
     */

    public void calcularMedia(
            final String nome,
            final double ap1,
            final double ap2,
            final double as) {
        double media = (ap1 + ap2) / 2;

        String resultado = "";

        // Verifica se a média inicial é suficiente para aprovação
        if (media >= NOTA_MINIMA) {
            resultado = String.format("%s aprovado com média %.2f",
                        nome, media);
        } else {
            // Calcula a média considerando a maior das provas e a AS
            media = (max(ap1, ap2) + as) / 2;
            // Verifica se a média após a recuperação é suficiente
            if (media >= NOTA_MINIMA) {
                resultado = String.format("%s aprovado com média %.2f",
                        nome, media);
            } else {
                resultado = String.format("%s reprovado com média %.2f",
                        nome, media);
            }
        }

        // Agora, invoca o logger.info apenas uma vez, após todas as condições
        LGR.info(resultado);
    }

}
