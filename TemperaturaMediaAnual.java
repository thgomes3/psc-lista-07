import java.util.Scanner;

public class TemperaturaMediaAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        double[] temperaturas = new double[12];
        double soma = 0.0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double mediaAnual = soma / 12;

        System.out.printf("\nMédia anual de temperatura: %.2f°
