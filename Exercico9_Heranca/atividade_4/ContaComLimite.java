package atividade_4;

public class ContaComLimite extends ContaBancaria {
    
    private double limite;
    private double juros;
    private final double PERCENTUAL_JUROS = 0.1456;

    public ContaComLimite(int numero, String nomeCorrentista) {
        super(numero, nomeCorrentista);
    }

    public double getLimite() {
        return this.limite;
    }

    public boolean setLimite(double limite) {
        if (limite < 0)
            return false;
        this.limite = limite;
        return true;
    }

    public double getJuros() {
        return this.juros;
    }

    public boolean quitaJuros() {
        if (this.saldo < this.juros)
            return false;
        this.saldo -= this.juros;
        this.juros = 0.0;
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0)
            return false;
        if (valor > this.saldo + this.limite)
            return false;
        if (valor > this.saldo) {
            double diff = valor - this.saldo;
            this.juros += diff * PERCENTUAL_JUROS;
            this.saldo = 0.0;
            this.limite -= diff;
            return true;
        }
        this.saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLimite: " + limite + "\nJuros: " + juros;
    }

}
