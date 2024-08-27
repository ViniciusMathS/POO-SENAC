package br.com.poo.aula2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploThrow {

    public static void main(String[] args) {
        System.out.println("Olá");
        try {
            metodo1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void metodo1() throws DadosInvalidosException{
        System.out.print("Informe um nome: ");
        String nome = new Scanner(System.in).next();
        if (nome.length()<=2){
            throw new DadosInvalidosException("Nome deve ser maior que 2 caracteres");
        }
        metodo2();
    }
    public static void metodo2(){
        System.out.println("metodo 2");
    }
}
