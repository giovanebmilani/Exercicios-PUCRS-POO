public class ProductOutOfStock extends Exception {
    private int quantidadeDisponivel;

    public ProductOutOfStock(int quantidadeDisponivel) {
        super("Produto fora de estoque.");
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}
