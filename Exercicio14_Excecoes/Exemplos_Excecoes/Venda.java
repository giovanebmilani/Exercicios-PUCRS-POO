public class Venda {

    public boolean insereItem(int codigo, int quantidade) throws ProductNotFound, ProductOutOfStock {
        // se produdo nao encontrado
        if (codigo != 10) {
            throw new ProductNotFound("Produto não encontrado.");
        }

        // produto fora de estoque
        if (quantidade > 3) {
            throw new ProductOutOfStock(3);
        }

        return true;
    }
}
