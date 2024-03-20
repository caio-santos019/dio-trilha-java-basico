import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome:");
        String nome = sc.next();

        System.out.println("Informe o número da agência:");
        String agencia = sc.next();

        System.out.println("Informe o número da conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Informe o saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
