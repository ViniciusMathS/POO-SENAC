package br.com.poo.aula5;

import java.util.*;

public class MapExemplo {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Vinicius Matheus de Souza");
        lista.add("Vinicius Matheus de Souza");
        lista.add("Matheus da costa rosa");

        System.out.println("Valores da List:");
        for(String item : lista){
            System.out.println(item);
        }

        Set<String> listaSemRepeticao = new HashSet<>();

        listaSemRepeticao.add("Vinicius Matheus de Souza");
        listaSemRepeticao.add("Vinicius Matheus de Souza");
        listaSemRepeticao.add("Matheus da costa rosa");
        listaSemRepeticao.add("Vinicius Matheus de Souza");

        System.out.println("\nItens do Set:");
        for(String item : listaSemRepeticao){
            System.out.println(item);
        }

        Map<String, String> mapa = new HashMap<>();



        mapa.put("292.344.359-68", "Vinicius Matheus de Souza");
        mapa.put("993.242.409-18", "Cabeça de Bagre");
        mapa.put("123.223.999-56", "Matheus da costa rosa");

        System.out.println("\nValores do Map:");
        mapa.forEach((k,v) -> {
            System.out.println(k + " : " + v);
        });
    }

}
