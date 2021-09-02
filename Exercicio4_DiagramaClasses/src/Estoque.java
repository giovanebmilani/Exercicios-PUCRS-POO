import java.util.ArrayList;

public class Estoque {
    
    private ArrayList<ItemEstoque> items;

    public Estoque() {
        this.items = new ArrayList<ItemEstoque>();
    }

    public int getQuantidadeDisponivel(int codigo) {

        return 0;
    }

    public boolean baixaEstoque(int codigo, int qtd) {
        return true;
    }

    public boolean adicionaProduto(Produto produto, int qtd) {
        return true;
    }
    

}
