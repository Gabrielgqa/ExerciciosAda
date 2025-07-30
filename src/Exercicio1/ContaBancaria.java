package Exercicio1;

public class ContaBancaria {
    protected int numero;
    protected double saldo;
    protected double limite;

    public ContaBancaria(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque negado. Saldo insuficiente.");
            return false;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void imprimirDados(){
        System.out.println("Numero da conta: " + numero + "- Saldo: " + saldo);
    }
}
