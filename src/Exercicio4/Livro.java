package Exercicio4;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public void exibirInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicado);
        System.out.println("----------------------");
    }
}