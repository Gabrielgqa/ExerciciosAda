package Exercicio1;

public class ContaEspecial extends  ContaBancaria{
    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo, limite);
    }

    public boolean sacar(double valor){
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque negado. Valor excede o limite permitido.");
            return false;
        }
    }
}
