import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItens(Item item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;

        for (Item item: itens){
            //double preco = item.getPreco();
            //int quantide = item.getQuantidade();
            total += calcularValorItem(item);
        }

        return total;
    }

    private double calcularValorItem(Item item){
        return item.getPreco() * item.getQuantidade();
    }
}
