import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
            } else {
            System.out.println("O número é impar!");
        }
        System.out.println("Obrigado por utilizar esse programa!");
    }
}
