public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        /*
         * Para que o valor de uma váriavel nunca seja alterado
         * é necessário que a declaração seja feita em caixa alta
         * e se utilize a palavra "final" no início.
         */
        final double VALOR_DE_PI = 3.14;
    }
}
