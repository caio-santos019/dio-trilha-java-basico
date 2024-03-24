import java.util.Scanner;

public class TryCatchYoutubeExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;

        try {
            System.out.println("What's your age?");
            age = scan.nextInt();
            System.out.println("Your age is " + age);
        } catch (Exception e) {
            System.out.println("Invalid age!");
        } finally {
            System.out.println("The process has been completed!");
        }
        scan.close();
    }
}
