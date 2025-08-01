package Exercicio7;

public class Livro {
    public String titulo;
    String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(paginas);
    }
}
