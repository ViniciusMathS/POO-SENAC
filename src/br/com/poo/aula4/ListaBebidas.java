package br.com.poo.aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaBebidas {

    public static void main(String[] args) {

        List<String> bebidas = new ArrayList<>();

        bebidas.add("soda");
        bebidas.add("vinho");
        bebidas.add("coca");
        bebidas.add("agua");

        System.out.print("Qual bebida você quer: ");
        String nome = new Scanner(System.in).next();

       imprimirLista(bebidas);

       remover(bebidas, nome);

       imprimirLista(bebidas);

    }

    public static int isExist(List lista, String nome){
        return lista.indexOf(nome);
    }

    public static void remover(List lista, String nome){
        int index = isExist(lista, nome);
        if (index != -1){
            lista.remove(index);
            System.out.println("Bebida removida");
        }else{
            System.out.println("A bebida não existe!");
        }

    }

    public static void imprimirLista(List lista){
        for(Object item : lista){
            System.out.println(item);
        }
    }

}
