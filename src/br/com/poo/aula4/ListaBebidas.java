package br.com.poo.aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaBebidas {

    public static void main(String[] args) {

        List<String> bebidas = new ArrayList<>();

        bebidas.add("soda");
        bebidas.add("vinho");
        bebidas.add("coca");
        bebidas.add("agua");

        adicionar(bebidas);

        System.out.print("Qual bebida você quer excluir: ");
        String nome = new Scanner(System.in).next();

        remover(bebidas, nome);

        Collections.sort(bebidas);
        imprimirLista(bebidas);

    }

    public static int isExist(List lista, String nome) {
        return lista.indexOf(nome);
    }

    public static void remover(List lista, String nome) {
        int index = isExist(lista, nome);
        if (index != -1) {
            lista.remove(index);
            System.out.println("Bebida removida");
        } else {
            System.out.println("A bebida não existe!");
        }

    }

    public static void imprimirLista(List lista) {
        for (Object item : lista) {
            System.out.println(item);
        }
    }

    private static void isBebidasExist(List lista, String nome) throws IllegalArgumentException {
        if (lista.indexOf(nome) != -1) {
            throw new IllegalArgumentException("Esta bebiada ja existe!");
        }
    }

    public static void adicionar(List lista) {

        while (true) {
            try {
                System.out.println("continuar adicionado? [S] [N]: ");
                char resposta = new Scanner(System.in).next().toUpperCase().charAt(0);
                if (resposta != 'S') {
                    break;
                }

                System.out.println("Qual bebida você quer adicionar: ");
                String bebida = new Scanner(System.in).next().toLowerCase();

                isBebidasExist(lista, bebida);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }


    }

}
