package Exercicio8;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Analista analista = new Analista();

        System.out.println(funcionario.calcularSalario());
        System.out.println(analista.calcularSalario());
    }
}
