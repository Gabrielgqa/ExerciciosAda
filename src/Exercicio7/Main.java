package Exercicio7;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Titulo 1", "Autor 1", 10);

        System.out.println(livro.autor);
        System.out.println(livro.titulo);
        System.out.println("--------------");
        // System.out.println(livro.paginas); Não acessível

        livro.exibirInformacoes();
    }
}
