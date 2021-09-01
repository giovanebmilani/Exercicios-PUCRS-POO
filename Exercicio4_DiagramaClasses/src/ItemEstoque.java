

public class ItemEstoque {
    
    private Produto produto;
    private int quantidadeDisponivel;

    public ItemEstoque(Produto produto, int quantidadeDisponivel) {
        this.produto = produto;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Produto getProduto() {
        return this.produto;
    }
    
    public int getQuantidadeDisponivel() {
        return this.quantidadeDisponivel;
    }
    
    public boolean baixaEstoque(int qtd) {
        if (qtd < 0) {
            return false;
        }

        if (qtd > this.quantidadeDisponivel) {
            return false;
        }

        this.quantidadeDisponivel -= qtd;
        return true;
    }

    public boolean reposicaoEstoque(int qtd) {
        if (qtd < 0) {
            return false;
        }

        this.quantidadeDisponivel += qtd;
        return true;
    }
 
    public boolean removeProduto(int codigo) {
        return true;
    }
}
