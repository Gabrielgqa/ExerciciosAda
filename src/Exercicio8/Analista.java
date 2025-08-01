package Exercicio8;

public class Analista extends Funcionario {
    @Override
    public double calcularSalario() {
        return 3000.0 + BONUS_BASE;
    }
}
