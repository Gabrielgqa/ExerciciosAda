package Exercicio6;

public class CaixaDeCompras {

    public double calcularTotalComDesconto(double valor1, double valor2, double valor3) {
        double total = valor1 + valor2 + valor3;
        if (total > 100) {
            total *= 0.9;
        }
        return total;
    }
}
