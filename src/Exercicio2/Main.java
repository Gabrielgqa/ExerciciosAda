package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000.00);
        Produto produto2 = new Produto("Mouse", 100.00);

        ItemPedido item1 = new ItemPedido(produto1, 1);
        ItemPedido item2 = new ItemPedido(produto2, 2);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.imprimirResumo();
    }
}
