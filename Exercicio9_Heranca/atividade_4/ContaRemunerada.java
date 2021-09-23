package atividade_4;

public class ContaRemunerada extends ContaBancaria {

    private final double PERCENTUAL_REMUNERACAO = 0.0465;

    public ContaRemunerada(int numero, String nomeCorrentista) {
        super(numero, nomeCorrentista);
    }
    
    public void setPercentualRemuneracao(double valorDeposito) {
        this.saldo += valorDeposito * PERCENTUAL_REMUNERACAO;
    }

    @Override
    public boolean deposito(double valor) {
        if (valor <= 0)
            return false;
        this.saldo += valor;
        this.setPercentualRemuneracao(valor);
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPercentual remuneração: " + PERCENTUAL_REMUNERACAO*100 + "%";
    }

}
