package Exercicio4;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("101", "Roberto", 1988);
        Livro livro2 = new Livro("202", "Roberto", 1992);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
