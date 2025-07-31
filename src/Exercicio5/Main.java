package Exercicio5;

public class Main {
    public static void main(String[] args){
        Contato contato1 = new Contato("Carlos", "7198888886");
        Contato contato2 = new Contato("Gabriel", "7896523235");

        contato2.atualizaTelefone("71988376204");

        String resp1 = contato1.obterContatoFormatado();
        String resp2 = contato2.obterContatoFormatado();

        System.out.println(resp1);
        System.out.println(resp2);
    }
}
