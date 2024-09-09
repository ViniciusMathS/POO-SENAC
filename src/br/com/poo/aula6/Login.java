package br.com.poo.aula6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Map<String, String> usuarios = new HashMap<>();

        while (true) {

            System.out.println("========== Menu ==========");
            System.out.println("[1] Cadastrar usuario\n[2] Efetuar Login\n[0] Sair");
            System.out.println("========== Menu ==========");
            System.out.print("=>");
            int option = new Scanner(System.in).nextInt();

            if (option == 1) {
                cadastrarUsuario(usuarios);
            } else if (option == 2) {
                fazerLogin(usuarios);
            } else {
                System.out.println("Operação finalizada");
                break;
            }

        }

    }

    public static void cadastrarUsuario(Map<String, String> mapa) {

        System.out.print("Informe seu email: ");
        String email = new Scanner(System.in).next();

        System.out.print("Informe sua seanha: ");
        String senha = new Scanner(System.in).next();

        if (!(isValidEmail(mapa, email))) {
            System.out.println("O Email informado já está cadastrado..");
        } else if (!(isValidSenha(senha))) {
            System.out.println("A senha deve conter 6 ou mais caracteres.");
        } else {
            System.out.println("A senha deve conter 6 ou mais caracteres.");
            mapa.put(email, senha);
            System.out.println("Usuario cadastrado com sucesso.");
        }

    }

    public static void fazerLogin(Map<String, String> mapa) {

        System.out.print("Informe seu email: ");
        String email = new Scanner(System.in).next();
        System.out.print("Informe sua seanha: ");
        String senha = new Scanner(System.in).next();

        if (isValidLogin(mapa, email, senha)) {
            System.out.println("Login efetuado com sucesso.");
        } else {
            System.out.println("Email ou senha invalida");
        }

    }

    public static boolean isValidLogin(Map<String, String> mapa, String email, String senha) {
        for (Map.Entry<String, String> usuario : mapa.entrySet()) {
            if (usuario.getKey().equalsIgnoreCase(email) && usuario.getValue().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidSenha(String senha) {
        return senha.length() >= 6;
    }

    public static boolean isValidEmail(Map<String, String> mapa, String email) {
        return mapa.containsKey(email);
    }
}
