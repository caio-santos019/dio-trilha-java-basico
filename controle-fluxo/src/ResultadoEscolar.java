
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
         * int nota = 6;
         * 
         * if (nota >= 7) {
         * System.out.println("Aprovado");
         * } else if (nota >= 5 && nota < 7) {
         * System.out.println("Prova de recuperação");
         * } else {
         * System.out.println("Reprovado");
         * }
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota do aluno: ");
        int nota = sc.nextInt();
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

        sc.close();

    }
}
