public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.adicionarItens(new Item("teclado", 10, 1));
        pedido.adicionarItens(new Item("mouse", 400, 3));
        pedido.adicionarItens(new Item("carregador", 300, 4));
        pedido.adicionarItens(new Item("monitor", 2000, 2));

        System.out.println("Valor total do pedido: R$ " + pedido.calcularTotal());
    }
}