package com.example;

import java.util.Scanner;

public class java03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String meuNome = "Bruno";
        int minhaIdade = 21;
        float meuPeso = 70;
        float minhaAltura = 1.80f;
        String minhaSerieFavorita = "Hunter x Hunter";
        String minhaMusicaFavorita = "O mundo é um moinho";
        String meuJogoFavorito = "Counter Strike";
        int contador = 0;

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        if (nome.equals(meuNome)) {
            System.out.println("Pessoa com nome igual.");
            contador++;
        } else {
            System.out.println("Pessoa com nome diferente.");
        }

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade == minhaIdade) {
            System.out.println("A pessoa tem a mesma idade que eu.");
            contador++;
        } else {
            System.out.println("A pessoa tem uma idade diferente da minha.");
        }

        System.out.print("Digite seu peso: ");
        float peso = scanner.nextFloat();
        if (peso == meuPeso) {
            System.out.println("Pessoa com o peso igual ao meu.");
            contador++;
        } else {
            System.out.println("Pessoa com o peso diferente do meu.");
        }

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();
        if (altura == minhaAltura) {
            System.out.println("Pessoa com altura igual a minha.");
            contador++;
        } else {
            System.out.println("A altura não é igual a minha.");
        }

        scanner.nextLine(); 

        System.out.print("Digite sua série favorita: ");
        String serieFavorita = scanner.nextLine();
        if (serieFavorita.equals(minhaSerieFavorita)) {
            System.out.println("Pessoa com a mesma série favorita.");
            contador++;
        } else {
            System.out.println("Pessoa com série favorita diferente.");
        }

        System.out.print("Digite sua música favorita: ");
        String musicaFavorita = scanner.nextLine();
        if (musicaFavorita.equals(minhaMusicaFavorita)) {
            System.out.println("Pessoa com a mesma música favorita.");
            contador++;
        } else {
            System.out.println("Pessoa com música favorita diferente.");
        }

        System.out.print("Digite seu jogo favorito: ");
        String jogoFavorito = scanner.nextLine();
        if (jogoFavorito.equals(meuJogoFavorito)) {
            System.out.println("Pessoa com o mesmo jogo favorito.");
            contador++;
        } else {
            System.out.println("Pessoa com jogo favorito diferente.");
        }

        if (contador >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa tem algumas diferenças.");
        }

        scanner.close();
    }
}
