

public class Eletrodomestico extends Produto {
    
    private boolean voltagem220;

    public Eletrodomestico(int codigo, String descricao, double preco, boolean voltagem220) {
        super(codigo, descricao, preco);
        this.voltagem220 = voltagem220;
    }

    public boolean isVoltagem220() {
        return this.voltagem220;
    }

    @Override
    public String toString() {
        int voltagem = (voltagem220) ? 220 : 110;
        return super.toString() + "\nVoltagem: " + voltagem + "v";
    }

}
