public class Operadores {
    public static void main(String[] args) {

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        // forma incorreta de transformar um numero negativo em positivo
        numero = +numero;

        System.out.println(numero);

        // forma correta
        numero = numero * -1;

        System.out.println(numero);

    }
}
