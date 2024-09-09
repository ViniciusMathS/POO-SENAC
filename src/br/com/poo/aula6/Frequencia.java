package br.com.poo.aula6;

import java.util.HashMap;
import java.util.Map;

public class Frequencia {

    public static void main(String[] args) {

        String[] palavras = new String[]{"aaa", "bbb", "bbb", "ddd", "aaa", "bbb", "ccc", "ccc", "ddd", "eee", "bbb"};

        System.out.println(frequencia(palavras));

    }

    public static Map<String, Integer> frequencia(String[] arr){
        Map<String, Integer> frequeciaPalavras = new HashMap<>();
        for(String palavra : arr){

            if(frequeciaPalavras.containsKey(palavra)){
                frequeciaPalavras.put(palavra, frequeciaPalavras.get(palavra)+1);
            }else{
                frequeciaPalavras.put(palavra, 1);
            }


        }
        return frequeciaPalavras;
    }
}
