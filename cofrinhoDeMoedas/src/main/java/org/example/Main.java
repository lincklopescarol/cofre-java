package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // colocando Menu e as opções
        System.out.println("---------------Menu do Cofrinho ---------------");
        System.out.println("Pressione 1: Adicionar moedas de diferentes valores e países em seu cofrinho.");
        System.out.println("Pressione 2: Remover moedas específicas do cofrinho.");
        System.out.println("Pressione 3: Listar todas as moedas que estão dentro do cofrinho.");
        System.out.println("Pressione 4: Calcular quanto dinheiro existe no cofrinho convertido para Real.");
        System.out.println("Pressione 0: Encerrar o programa.");
        int opcaoEscolhida = teclado.nextInt();

        Cofrinho cofrinho = new Cofrinho();

        int tipoMoeda, quantidadeMoedas = 0;
        double valor = 0;
        Moeda moeda;

        while (opcaoEscolhida != 0) {
            switch (opcaoEscolhida) {
                case 1:
                    tipoMoeda=0;
                    while(tipoMoeda>3 || tipoMoeda<=0) {
                        System.out.println("1-Dólar");
                        System.out.println("2-Euro");
                        System.out.println("3-Real");
                        tipoMoeda = teclado.nextInt();
                    }
                    moeda =null;
                    if(tipoMoeda==1) {
                        System.out.println("Quantidade de moedas?");
                        quantidadeMoedas = teclado.nextInt();
                        System.out.println("Valor?");
                        valor = teclado.nextDouble();
                        moeda = new Dolar(valor, quantidadeMoedas);
                    } else if (tipoMoeda == 2) {
                        System.out.println("Quantidade de moedas?");
                        quantidadeMoedas = teclado.nextInt();
                        System.out.println("Valor?");
                        valor = teclado.nextDouble();
                        moeda = new Euro(valor, quantidadeMoedas);
                    } else {
                        System.out.println("Quantidade de moedas?");
                        quantidadeMoedas = teclado.nextInt();
                        System.out.println("Valor?");
                        valor = teclado.nextDouble();
                        moeda = new Real(valor, quantidadeMoedas);
                    }
                    cofrinho.adicionar(moeda);
                    break;
                case 2:
                    tipoMoeda=0;
                    while(tipoMoeda>3 || tipoMoeda<=0) {
                        System.out.println("1-Dólar");
                        System.out.println("2-Euro");
                        System.out.println("3-Real");
                        tipoMoeda = teclado.nextInt();
                    }
                    moeda =null;
                    if(tipoMoeda==1) {
                        System.out.println("Quantidade de moedas?");
                        quantidadeMoedas = teclado.nextInt();
                        System.out.println("Valor?");
                        valor = teclado.nextDouble();
                        moeda = new Dolar(valor, quantidadeMoedas);
                    } else if (tipoMoeda == 2) {
                        System.out.println("Quantidade de moedas?");
                        quantidadeMoedas = teclado.nextInt();
                        System.out.println("Valor?");
                        valor = teclado.nextDouble();
                        moeda = new Euro(valor, quantidadeMoedas);
                    } else {
                        System.out.println("Quantidade de moedas?");
                        quantidadeMoedas = teclado.nextInt();
                        System.out.println("Valor?");
                        valor = teclado.nextDouble();
                        moeda = new Real(valor, quantidadeMoedas);
                    }
                    cofrinho.remover(moeda);
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    tipoMoeda = 0;
                    while(tipoMoeda>3 || tipoMoeda<=0) {
                        System.out.println("1-Dólar");
                        System.out.println("2-Euro");
                        System.out.println("3-Real");
                        tipoMoeda = teclado.nextInt();
                    }
                    if(tipoMoeda == 1) {
                        Dolar converter = new Dolar(valor, quantidadeMoedas);
                        double valorEmReal = converter.converter();
                        System.out.println("O valor em real dos seus dólares é: " + (quantidadeMoedas) * valorEmReal);
                    } else if (tipoMoeda == 2) {
                        Euro converter = new Euro(valor, quantidadeMoedas);
                        double valorEmReal = converter.converter();
                        System.out.println("O valor em real dos seus euros é: " + (quantidadeMoedas) * valorEmReal);
                    } else {
                        Real converter = new Real(valor, quantidadeMoedas);
                        double valorEmReal = converter.converter();
                        System.out.println("O valor em real: " + (quantidadeMoedas) * valorEmReal);
                    }
                    break;
                default:
                    System.out.println("Por favor, digite uma opção válida. ");

            }
            System.out.println("---------------Menu do Cofrinho ---------------");
            System.out.println("Pressione 1: Adicionar moedas de diferentes valores e países em seu cofrinho.");
            System.out.println("Pressione 2: Remover moedas específicas do cofrinho.");
            System.out.println("Pressione 3: Listar todas as moedas que estão dentro do cofrinho.");
            System.out.println("Pressione 4: Calcular quanto dinheiro existe no cofrinho convertido para Real.");
            System.out.println("Pressione 0: Encerrar o programa.");
            opcaoEscolhida = teclado.nextInt();
        }
    }
}
