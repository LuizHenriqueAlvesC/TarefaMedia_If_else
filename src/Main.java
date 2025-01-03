import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota de portugues: ");
        int nota1 = s.nextInt();

        System.out.println("Digite sua nota de matematica: ");
        int nota2 = s.nextInt();

        System.out.println("Digite sua nota de historia: ");
        int nota3 = s.nextInt();

        System.out.println("Digite sua nota de ciencias: ");
        int nota4 = s.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Sua média é " + media);


        if (media >= 7 ) {
            System.out.println(". Você está provado");
        } else if (media >= 5) {
            System.out.println(". Você está de recuperação");
        } else {
            System.out.println(". Você está reprovado");
        }
    }
}