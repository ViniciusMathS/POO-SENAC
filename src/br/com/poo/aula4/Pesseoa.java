package br.com.poo.aula4;

public class Pesseoa {

    private String nome;
    private int idade;
    private boolean ehGay;

    public boolean isEhGay() {
        return ehGay;
    }

    public void setEhGay(boolean ehGay) {
        this.ehGay = ehGay;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.nome+","+this.idade+","+this.ehGay;
    }
}
