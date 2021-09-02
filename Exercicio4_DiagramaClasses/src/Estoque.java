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

    public boolean baixaEstoque(int codigo, int qtd) {
        if (qtd < 0) {
            return false;
        }

        return true;
    }

    public boolean adicionaProduto(Produto produto, int qtd) {
        return true;
    }
    

}
