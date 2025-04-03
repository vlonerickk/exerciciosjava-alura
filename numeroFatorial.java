import java.util.Scanner;

public class numeroFatorial {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um número.");
            int numeroDigitado = leitor.nextInt();
            double numeroConta = 1;
            for (int i = numeroDigitado; i > 1; i--) {
                numeroConta = numeroConta * i;
            }
            System.out.printf("O fatorial desse número é: " + numeroConta);
        }
    }



