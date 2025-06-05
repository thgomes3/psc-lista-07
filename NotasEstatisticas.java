import java.util.ArrayList;
import java.util.Scanner;

public class NotasEstatisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");

        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }

        int quantidade = notas.size();
        System.out.println("\nQuantidade de valores lidos: " + quantidade);

        System.out.print("Valores na ordem em que foram informados: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\n\nValores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        System.out.println("\nSoma dos valores: " + soma);

        double media = (quantidade > 0) ? soma / quantidade : 0;
        System.out.println("Média dos valores: " + media);

        int acimaDaMedia = 0;
        int abaixoDeSete = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
            if (nota < 7) {
                abaixoDeSete++;
            }
        }

        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("\nPrograma encerrado. Obrigado!");
        
        scanner.close();
    }
}
