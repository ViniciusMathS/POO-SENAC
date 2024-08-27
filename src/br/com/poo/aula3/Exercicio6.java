package br.com.poo.aula3;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.print("Informe qual tabuada você deseja: ");
                int num = new Scanner(System.in).nextInt();
                if(num<1 || num>10){
                    throw new Exception("Informe um numero entre 1 e 10!");
                }
                tabuada(num);
                break;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

    }

    public static void tabuada(int num) {
        for(int i = 1; i<11; i++){
            System.out.println(num + " x " + i + " = " + (i*num));
        }
    }
}
