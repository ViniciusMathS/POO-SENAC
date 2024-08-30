package br.com.poo.indicador1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        double saldo = 0;
        boolean existeErro;

        do {
            existeErro=false;

            try {

                System.out.print("Informe o nome de usuario: ");
                String userName = new Scanner(System.in).next();

                isUserNameValid(userName);

                System.out.print("Informe o quanto deseja depositar: ");
                double deposito = new Scanner(System.in).nextDouble();
                isValorValid(deposito);

                saldo+=deposito;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                existeErro=true;
            }

        } while (existeErro);

        saque(saldo);
    }

    private static void isUserNameValid(String userName) throws IllegalArgumentException {
        if (userName.length() < 3) {
            throw new IllegalArgumentException("O nome de usuario deve ter pelo menos 3 caracteres!");
        }
    }

    private static void isValorValid(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor deve ser positivo!");
        }
    }

    public static void saque(double saldo){
        boolean existeErro;
        int qtdSaque = 0;
        while(saldo>0){

            do{
                existeErro=false;

                try{

                    System.out.print("Informe o valor do saque: ");
                    double saque = new Scanner(System.in).nextDouble();

                    isValorValid(saque);

                    saldo = saldo - saque;
                    qtdSaque++;

                }catch (Exception e){
                    System.out.println(e.getMessage());
                    existeErro=true;
                }

            }while(existeErro);

            if (saldo<0){
                saldo = 0;
            }

            System.out.println("Saldo atual: "+saldo);

        }

        System.out.println("Sques: "+qtdSaque);

    }

}
