package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void imprimirResumo() {
        System.out.println("Resumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto().getNome() + " x" + item.getQuantidade() +
                    " = R$ " + item.calcularSubtotal());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}