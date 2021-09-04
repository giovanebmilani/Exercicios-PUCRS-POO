import java.util.ArrayList;

public class Estoque {
    
    private ArrayList<ItemEstoque> items;

    public Estoque() {
        this.items = new ArrayList<ItemEstoque>();
    }

    public int getQuantidadeDisponivel(int codigo) {
        for (ItemEstoque item : items) {
            if (item.getProduto().getCodigo() == codigo) {
                return item.getQuantidadeDisponivel();
            }
        }
        return -1;
    }

    public ItemEstoque getItem(int codigo) {
        for (ItemEstoque item: this.items) { 
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

    public boolean reposicaoEstoque(int codigo, int qtd) {
        ItemEstoque item = getItem(codigo);
        if (item == null)
            return false;
        return item.reposicaoEstoque(qtd);
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

        return items.add(item);
    }
    
    public boolean jaExiste(ItemEstoque item) {
        for (ItemEstoque itemEstoque : this.items) {
            if (itemEstoque.getProduto().getCodigo() == item.getProduto().getCodigo())
                return true;
        }
        return false;
    }

}
