package org.example;

import implemetation.Supermarket;
import implemetation.SupermarketArray;

import java.util.Scanner;

public class Main {

    public final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;

        do {
            System.out.println("\nLista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = sc.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item que deseja remover: ");
                    int index = sc.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do Programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);

        sc.close();
    }
}