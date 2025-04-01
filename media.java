import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = leitor.nextDouble();

        System.out.println("Sua média é: " + (nota1 + nota2 + nota3) /3);

    }
}
