import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        int media = s.nextInt();

        if (media >= 7 ) {
            System.out.println("Você está provado");
        } else if (media >= 5) {
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Você está reprovado");
        }
    }
}