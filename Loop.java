import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Avaliação 0 a 5 estrelas: ");
            nota = leitor.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao / 3);
    }
}
