

public class Eletropesado extends Produto {
    
    public Eletropesado(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public double getMargemLucro() {
        if (this.preco > 999.0)
            return preco * 0.2;
        return super.getMargemLucro();
    }

}
