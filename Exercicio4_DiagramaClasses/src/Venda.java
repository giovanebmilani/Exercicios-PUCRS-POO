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

    public boolean temEstoqueDisponivel(Produto produto, int qtd) {
        return true;
    }

    public boolean jaExiste(ItemVenda itemVenda) {
        for (ItemVenda item: items) {
            if (item == itemVenda) 
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

    public boolean removeItem(int numeroItem) {
        return true;
    }

    public void imprimeRecibo() {

    }

    public double getTotal() {
        return 0.0;
    }

    public double getImposto() {
        return IMPOSTO;
    }
    
    public double getDesconto() {
        return 0.0;
    }

    public double getValorVenda() {
        return 0.0;
    }

    public boolean conclui() {
        return true;
    }
}
