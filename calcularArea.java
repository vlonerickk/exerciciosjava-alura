import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calcularArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String texto = """
                1. Calcular área do quadrado.
                2. Calcular área do circulo.
                3. Sair do programa.
                """;
        System.out.println(texto + "\nDigite uma opção: ");
        int num = leitor.nextInt();
        switch (num) {
            case 1:
                System.out.println("Você escolheu calcular a área do quadrado!");
                break;
            case 2:
                System.out.println("Você escolheu calcular a área do cirulo!");
                break;
            default:
                System.out.println("Saindo do programa.");
        }
        }
    }

