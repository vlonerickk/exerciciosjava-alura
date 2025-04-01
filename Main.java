import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do produto: ");
        double precoOriginal = scanner.nextDouble();

        System.out.println("Insira a porcentagem de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        System.out.println("Valor descontado: " + (precoOriginal * percentualDesconto/100));
        double valorDescontado = precoOriginal - percentualDesconto;

        System.out.println("O valor com o desconto é: " + valorDescontado);

    }
}
