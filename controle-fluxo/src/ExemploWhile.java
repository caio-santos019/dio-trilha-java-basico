import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valordoce = valorAleatorio();
            if (valordoce > mesada) {
                valordoce = mesada;
            }
            System.out.println("Doce do valor: " + valordoce + " adicionado no carrinho");
            mesada = mesada - valordoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
