package br.com.poo.aula4;

import java.util.Random;


public class SurveyAula {

    public static void main(String[] args) {

        int[] notas = new int[30];
        gerarNotas(notas);
        contarNotas(notas);

    }

    public static void gerarNotas(int[] notas) {

        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Random().nextInt(10) + 1;
        }

    }

    public static void contarNotas(int[] notas) {
        int[] qtdNotas = new int[10];
        for (int nota : notas) {
            qtdNotas[nota - 1] += 1;
        }
        System.out.println("Notas  Qtd");
        for (int i = 0; i < qtdNotas.length; i++) {
            System.out.println("  " + (i + 1) + "  :  " + qtdNotas[i]);
        }

    }

}
