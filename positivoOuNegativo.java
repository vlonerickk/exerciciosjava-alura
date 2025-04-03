import java.util.Scanner;

public class positivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = leitor.nextInt();

        if (num < 0) {
            System.out.println("O número é negativo!");
        } else if (num > 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é zero!");
        }
        }

    }
