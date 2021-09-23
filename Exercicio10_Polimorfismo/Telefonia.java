

public class Telefonia extends Produto {
    
    private boolean importado;

    public Telefonia(int codigo, String descricao, double preco, boolean importado) {
        super(codigo, descricao, preco);
        this.importado = importado;
    }

    public boolean isImportado() {
        return this.importado;
    }

    @Override
    public double getImposto() {
        if (this.importado)
            return preco * 0.5;
        return super.getImposto();
    }

    @Override
    public String toString() {
        String origem = (importado) ? "Importado" : "Nacional";
        return super.toString() + "\nOrigem: " + origem;
    }

}
