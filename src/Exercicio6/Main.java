package Exercicio6;

public class Main {
    public static void main(String[] args){
        CaixaDeCompras caixa = new CaixaDeCompras();

        double total1 = caixa.calcularTotalComDesconto(20.0, 30.0, 40.0);
        System.out.printf("Total 1 (menor que 100): R$ %.2f%n", total1);

        double total2 = caixa.calcularTotalComDesconto(30.0, 30.0, 40.0);
        System.out.printf("Total 2 (igual a 100): R$ %.2f%n", total2);

        double total3 = caixa.calcularTotalComDesconto(50.0, 60.0, 10.0);
        System.out.printf("Total 3 (maior que 100, com desconto): R$ %.2f%n", total3);
    }
}
