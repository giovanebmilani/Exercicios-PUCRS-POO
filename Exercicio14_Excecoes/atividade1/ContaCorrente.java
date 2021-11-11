

public class ContaCorrente {
    
    private double saldo;
 
    public ContaCorrente(double saldoInicial) {
        if (saldoInicial >= 0)
            saldo = saldoInicial;
    }

    public double getSaldo() { 
        return this.saldo; 
    }

    public void deposito(double valor) {
        if (valor >= 0)
            saldo += valor;
    }
    
    public void retirada(double valor) {
        if (valor > 0)
            if (valor <= this.saldo)
                saldo -= valor;
    }

    

}
