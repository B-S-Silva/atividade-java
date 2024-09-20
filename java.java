package com.example;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos dados de entrada
        System.out.print("Digite o valor total da fatura: ");
        double valorFatura = scanner.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        System.out.print("Digite o percentual de desconto por pagamento antecipado (%): ");
        double percentualDesconto = scanner.nextDouble();

        System.out.print("Digite o percentual de multa por atraso (%): ");
        double percentualMulta = scanner.nextDouble();

        // calculo do valor com desconto
        double valorComDesconto = valorFatura - (valorFatura * (percentualDesconto / 100));

        // calculo da multa por atraso
        double valorParcelaSemMulta = valorFatura / numeroParcelas;
        double valorMulta = valorParcelaSemMulta * (percentualMulta / 100);
        double valorParcelaComMulta = valorParcelaSemMulta + valorMulta;

        // saida dos resultados
        System.out.println("\nValor total com desconto para pagamento antecipado: R$ " + valorComDesconto);

        System.out.println("\nValor de cada parcela com multa por atraso: ");
        for (int i = 1; i <= numeroParcelas; i++) {
            System.out.println("Parcela " + i + ": R$ " + valorParcelaComMulta + " (Multa: R$ " + valorMulta + ")");
        }

        scanner.close();
    }
}
