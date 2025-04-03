import java.util.Scanner;

public class numeroDigitado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        double numeroDigitado1 = leitor.nextDouble();
        double numeroDigitado2 = leitor.nextDouble();

        if (numeroDigitado1 > numeroDigitado2) {
            System.out.println("O primero número é maior!");
        }
        else if (numeroDigitado1 < numeroDigitado2) {
            System.out.println("O segundo número é maior!");
        }
        else {
            System.out.println("Os dois são iguais!");
        }
    }
}
