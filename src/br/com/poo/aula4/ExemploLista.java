package br.com.poo.aula4;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {

        List<Integer> listaArr = new ArrayList<>();

        System.out.println("Quantidade registros: "+listaArr.size());

        listaArr.add(23);
        listaArr.add(50);
        listaArr.add(0, 13);
        listaArr.set(1, 50);

        System.out.println(listaArr.indexOf(1));
        System.out.println(listaArr.contains(50));
        listaArr.remove(0);

        for (int item : listaArr){
            System.out.println(item);
        }
    }
}
