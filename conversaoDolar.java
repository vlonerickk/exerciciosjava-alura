import java.util.Scanner;

public class conversaoDolar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em Reais a ser convertido: ");
        double valorReais = leitor.nextDouble();

        System.out.println("Cotação do Dólar hoje: ");
        double valorDolar = leitor.nextDouble();

        System.out.println("O valor convertido é: " + (valorDolar*valorReais));


    }
}
