import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = leitor.next();

        System.out.println("Digite a quantidade do produto: ");
        int quantidadeProduto = leitor.nextInt();

        System.out.println("Digite o valor do produto: ");
        double valorProduto = leitor.nextDouble();

        System.out.println("Valor total: R$ " + valorProduto*quantidadeProduto);
    }
}
