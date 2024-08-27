package br.com.poo.aula1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSort = gerarNumeroAleatorio(50);
        int numChoose;
        int i = 1;

        while (true) {
            try {
                System.out.println(i + "ª tentativa");
                System.out.print("Escolha um numero: ");
                numChoose =  sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Informe somente números!");
                sc.next();
                continue;
            }
            if (numChoose != numSort) {
                if (numChoose > numSort) {
                    System.out.println("Número escolhido é maior que o número sorteado");
                } else {
                    System.out.println("Número escolhido é menor que o número sorteado");
                }
                i++;
            } else {
                System.out.println("Você acertou na " + i + "ª tentativa");
                break;
            }
        }
        sc.close();
    }

    public static int gerarNumeroAleatorio(int range) {
        return new Random().nextInt(range);
    }
}
