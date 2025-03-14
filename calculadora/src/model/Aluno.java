package model;

import static java.lang.Math.max;

public class Aluno {
    /**
     * A constante que define a nota mínima necessária para aprovação.
     */
    private static final int NOTA_MINIMA = 7;
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
        if (media >= NOTA_MINIMA) {
            System.out.println(nome + " aprovado");
        } else {
            media = (max(ap1, ap2) + as) / 2;
            if (media >= NOTA_MINIMA) {
                System.out.println(nome + " aprovado");
            } else {
                System.out.println(nome + " reprovado");
            }
        }
    }

}
