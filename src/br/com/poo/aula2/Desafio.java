package br.com.poo.aula2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        int num1;
        int num2;
        int result;
        while (true) {
            try {
                System.out.println("Informe o primeiro número");
                num1 = new Scanner(System.in).nextInt();
                System.out.println("Informe o segundo número");
                num2 = new Scanner(System.in).nextInt();
                result = num1 / num2;
                System.out.println(result);
                break;
            } catch (InputMismatchException e) {
                System.err.println("Deu erro: " + e.getMessage());

            } catch (ArithmeticException e) {
                System.err.println("Deu erro: " + e.getMessage());

            }
        }
    }
}
