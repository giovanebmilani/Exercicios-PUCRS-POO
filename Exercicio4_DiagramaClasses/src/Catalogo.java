import java.util.ArrayList;

public class Catalogo {
    
    private ArrayList<Produto> produtos;

    public Catalogo() {
        this.produtos = new ArrayList<Produto>();
    }

    public Produto getProduto (int codigo) {
        for (Produto produto : this.produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
    
    public boolean cadastra(Produto produto) {
        if (produto == null) {
            return false;
        }
        return produtos.add(produto);
    }
 
}
