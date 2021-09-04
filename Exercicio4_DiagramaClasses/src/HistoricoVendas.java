import java.util.ArrayList;

public class HistoricoVendas {
    
    private ArrayList<Venda> vendas;

    public HistoricoVendas() {
        this.vendas = new ArrayList<Venda>();
    }

    public Venda getVenda(int numero) {
        for (Venda venda : this.vendas)
            if (venda.getNumero() == numero)
                return venda;
        return null;
    }

    public boolean addVenda(Venda venda) {
        if (venda == null)
            return false;
        return this.vendas.add(venda);
    }

    public ArrayList<Venda> getUltimasVendas() {
        ArrayList<Venda> ultimasVendas = new ArrayList<Venda>(5);
        for (int i = 0; i < 5; i++) 
            ultimasVendas.add(this.vendas.get(-i));
        return ultimasVendas;
    }
 
}
