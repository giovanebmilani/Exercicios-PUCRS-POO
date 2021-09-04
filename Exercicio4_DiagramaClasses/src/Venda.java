import java.util.ArrayList;

public class Venda {
    
    private int numero;
    private ArrayList<ItemVenda> items;
    private final double IMPOSTO = 0.25;

    public Venda(int numero) {
        this.numero = numero;
        this.items = new ArrayList<ItemVenda>();
    }

    public int getNumero() {
        return this.numero;
    }

    public ItemVenda getItem(int numeroItem) {
        for (ItemVenda item : this.items) 
            if (item.getNumero() == numeroItem)
                return item;
        return null;
    }

    public boolean jaExiste(ItemVenda itemVenda) {
        for (ItemVenda item: items) {
            if (item.getProduto().getCodigo() == itemVenda.getProduto().getCodigo()) 
                return true; 
        }
        return false;
    }

    public boolean insereItem(Produto produto, int qtd) {
        if (produto == null) 
            return false;
        if (qtd < 0) 
            return false;
    
            
        ItemVenda item = new ItemVenda(1, produto, qtd, produto.getPrecoUnitario());
        if (jaExiste(item))
            return false;
        
        
        return this.items.add(item);
    }

    public ItemVenda removeItem(int numeroItem) {
        return this.items.remove(numeroItem-1);
    }

    public void imprimeRecibo() {
        
    }

    public double getTotal() {
        double total = 0;
        for (ItemVenda item: this.items)
            total += item.getValorItem();
        return total;
    }

    public double getImposto() {
        return IMPOSTO;
    }
    
    public double getDesconto() {
        if (this.items.size() > 10)
            return 0.1;
        return 0.0;
    }

    public double getValorVenda() {
        double valorVenda = getTotal();
        valorVenda = valorVenda - (valorVenda * getDesconto());
        valorVenda = valorVenda + (valorVenda * getImposto());
        return valorVenda;
    }

    public boolean conclui() {
        return true;
    }
}
