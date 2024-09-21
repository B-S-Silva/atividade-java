package com.example;

import java.util.Scanner;

public class java02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados de entrada
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade > 21) {
            System.out.println("A pessoa tem mais de 21 anos.");
        } else {
            System.out.println("A idade é 21 ou menor.");
        }

        System.out.print("Digite seu salário: ");
        float salario = scanner.nextFloat();
        if (salario > 7000) {
            System.out.println("É maior que 5 vezes o salário mínimo.");
        } else {
            System.out.println("O salário não é maior que 5 salários mínimos.");
        }

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();
        if (altura > 1.75) {
            System.out.println("É maior que 1,75 m.");
        } else {
            System.out.println("A altura não é maior que 1,75 m.");
        }

        System.out.print("Digite seu peso: ");
        float peso = scanner.nextFloat();
        if (peso > 70) {
            System.out.println("É maior que 70 kg.");
        } else {
            System.out.println("O peso não é maior que 70 kg.");
        }

        scanner.nextLine(); 
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        if (sobrenome.equals("Santos")) {
            System.out.println("O sobrenome é igual ao meu.");
        } else {
            System.out.println("Os sobrenomes não são iguais.");
        }

        System.out.print("Digite o gênero (f/m): ");
        char genero = scanner.next().charAt(0);
        if (genero == 'f') {
            System.out.println("Seu gênero é feminino.");
        } else {
            System.out.println("Seu gênero é masculino.");
        }

        scanner.close();
    }
}