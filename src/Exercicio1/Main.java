package Exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 1000, 0);
        ContaEspecial conta2 = new ContaEspecial(456, 500, 300);

        System.out.println("Operações na Conta Bancária comum:");
        conta1.imprimirDados();
        conta1.depositar(200);
        conta1.sacar(100);
        conta1.sacar(1200);
        conta1.imprimirDados();

        System.out.println("\nOperações na Conta Especial:");
        conta2.imprimirDados();
        conta2.depositar(100);
        conta2.sacar(700);
        conta2.sacar(300);
        conta2.imprimirDados();
    }
}
