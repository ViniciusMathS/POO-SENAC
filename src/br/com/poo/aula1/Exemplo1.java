package br.com.poo.aula1;

import java.util.Scanner;

public class Exemplo1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Usuario[] usuarios = new Usuario[5];

        for(int i = 0; i < usuarios.length; i++){

            usuarios[i] = new Usuario();
            System.out.print("Infome o nome do "+(i+1)+"º usuario: ");
            usuarios[i].nome = sc.next();
            System.out.print("Infome o sobrenome do "+(i+1)+"º usuario: ");
            usuarios[i].sobreNome = sc.next();
            System.out.print("Infome a idade do "+(i+1)+"º usuario: ");
            usuarios[i].idade = sc.nextInt();

        }

        for (Usuario user : usuarios){
            user.mostrarDados();
        }

    }

}
