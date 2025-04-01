import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Avaliação 0 a 5 estrelas: ");
            nota = leitor.nextDouble();

            if (nota != -1){

            mediaAvaliacao += nota;
            totalDeNotas++;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao / totalDeNotas);
    }

}}
