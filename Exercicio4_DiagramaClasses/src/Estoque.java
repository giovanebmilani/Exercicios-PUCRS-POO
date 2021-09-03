import java.util.ArrayList;

public class Estoque {
    
    private ArrayList<ItemEstoque> itens;

    public Estoque() {
        this.itens = new ArrayList<ItemEstoque>();
    }

    public int getQuantidadeDisponivel(int codigo) {
        for (ItemEstoque item : itens) {
            if (item.getProduto().getCodigo() == codigo) {
                return item.getQuantidadeDisponivel();
            }
        }
        return -1;
    }

    public ItemEstoque getItem(int codigo) {
        for (ItemEstoque item: this.itens) { 
            if (item.getProduto().getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }

    public boolean baixaEstoque(int codigo, int qtd) {
        ItemEstoque item = getItem(codigo);
        if (item == null)
            return false;
        return item.baixaEstoque(qtd);
    }

    public boolean adicionaProduto(Produto produto, int qtd) {
        if (produto == null) 
            return false;

        if (qtd < 0)
            return false;

        ItemEstoque item = new ItemEstoque(produto, qtd);
        // Verifica se o produto ja existe
        if (jaExiste(item))
            return false;

        return itens.add(item);
    }
    
    public boolean jaExiste(ItemEstoque item) {
        for (ItemEstoque itemEstoque : this.itens) {
            if (itemEstoque == item)
                return true;
        }
        return false;
    }

}
