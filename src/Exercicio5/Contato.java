package Exercicio5;

public class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void atualizaTelefone(String novoTelefone){
        this.telefone = novoTelefone;
    }

    public String obterContatoFormatado(){
        return String.format("Nome: %s - Telefone: %s", nome, telefone);
    }

}
