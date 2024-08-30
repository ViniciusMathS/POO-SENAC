package br.com.poo.aula5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ExercicioCep {

    public static void main(String[] args) {

        Map<String, String> mapCep = new HashMap<>();

        adicionarCepLogradouro(mapCep);
        imprimirLogradouro(mapCep);
        verificaCep(mapCep, "88138-154");
        verificaCep(mapCep, "88138-100");
        mapCep.remove("88138-100");
        exibirCepLogradouro(mapCep);

    }

    public static void adicionarCepLogradouro(Map<String, String> mapa) {
        mapa.put("88138-154", "Rua Valmor Francelino da Silva");
        mapa.put("88138-100", "Rua Domingos de Souza Filho");
        mapa.put("88138-110", "Servidão Francisco José Eleuthério");
        mapa.put("88138-120", "Rua Domingos João de Medeiros");
        mapa.put("88138-130", "Servidão Nova Esperança");
    }

    public static void imprimirLogradouro(Map<String, String> mapa) {

        for (String item : mapa.values()) {
            System.out.println(item);
        }

    }

    public static boolean isCepExiste(Map<String, String> mapa, String cep) {

        return mapa.containsKey(cep);

    }

    public static void verificaCep(Map<String, String> mapa, String cep) {

        if (isCepExiste(mapa, cep)) {
            System.out.println("O cep " + cep + " está registrado.");
        } else {
            System.out.println("O cep " + cep + " não está registrado.");
        }

    }

    public static void exibirCepLogradouro(Map<String, String> mapa) {

        System.out.println("\n*CEP*     : *Logradouro*");
        mapa.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
    }

    public static HashMap<String, String> test(Map<String, String> mapa) {
        HashMap<String, String> filterCeps = new HashMap<>();
        mapa.forEach((k, v) -> {
            if (v.charAt(0) != 'R') {
               filterCeps.put(k, v);
            }
        });
        return filterCeps;
    }

}
