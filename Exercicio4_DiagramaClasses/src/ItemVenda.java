

public class ItemVenda {

    private int numero;
    private Produto produto;
    private int quantidade;
    private double precoUnitarioCobrado;
    
    public ItemVenda(int numero, Produto produto, int quantidade, double precoUnitarioCobrado) {
        this.numero = numero;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioCobrado = precoUnitarioCobrado;
    }

    public int getNumero() {
        return this.numero;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPrecoUnitarioCobrado() {
        return this.precoUnitarioCobrado;
    }

    public double getValorItem() {
        return this.quantidade*this.precoUnitarioCobrado;
    }

    @Override
    public String toString() {
        return "ItemVenda [numero=" + numero + ", precoUnitarioCobrado=" + precoUnitarioCobrado + ", produto=" + produto
                + ", quantidade=" + quantidade + "]";
    }

        
}
