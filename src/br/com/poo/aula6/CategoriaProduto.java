package br.com.poo.aula6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriaProduto {

    public static void main(String[] args) {

        Map<String, List<String>> categorias = new HashMap<>();

        while (true) {

            System.out.println("========== Menu ==========");
            System.out.println("[1] Cadastrar categoria\n[2] Cadastrar itens\n[0] Sair");
            System.out.println("========== Menu ==========");
            System.out.print("=>");
            int option = new Scanner(System.in).nextInt();

            if (option == 1) {
                cadastrarCategoria(categorias);
            } else if (option == 2) {
                cadastrarItens(categorias);
            } else {
                System.out.println("Operação finalizada");
                break;
            }

        }

    }

    public static void cadastrarCategoria(Map<String, List<String>> mapa) {

        System.out.print("Informe o nome da categoria que deseja cadastrar: ");
        String categoria = new Scanner(System.in).next();
        if (isCategoriaValid(mapa, categoria)) {
            List<String> itensCategoria = new ArrayList<>();
            mapa.put(categoria, itensCategoria);
        } else {
            System.out.println("Categoria ja existente.");
        }
    }

    public static void cadastrarItens(Map<String, List<String>> mapa) {
        System.out.print("Informe o nome da categoria que deseja adicionar itens: ");
        String categoria = new Scanner(System.in).next();
        if (isCategoriaValid(mapa, categoria)) {
            List<String> itensCategoria = mapa.get(categoria);
            while (true) {
                System.out.print("Informe o nome do item que deseja adicionar na categoria " + categoria + ": ");
                String item = new Scanner(System.in).next();
                if (isExistItem(itensCategoria, item)){
                    System.out.println("Item ja existente.");
                    continue;
                }
                itensCategoria.add(item);
                System.out.print("Deseja continuar \n[1] SIM \n[0] NÃO \n=>");
                int option = new Scanner(System.in).nextInt();
                if (option == 1) {
                    System.out.println("Operação finalizada");
                    break;
                }
            }
            mapa.put(categoria, itensCategoria);
        } else {
            System.out.println("Categoria ja existente.");
        }
    }

    public static boolean isCategoriaValid(Map<String, List<String>> mapa, String categoria) {
        return mapa.containsKey(categoria);
    }

    public static boolean isExistItem(List<String> lista, String item){
        return lista.contains(item);
    }

}
