package atividade_4;


public class ContaBancaria {

    protected int numero;
    protected String nomeCorrentista;
    protected double saldo;

    public ContaBancaria(int numero, String nomeCorrentista) {
        this.numero = numero;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean deposito(double valor) {
        if (valor <= 0)
            return false;
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > this.saldo)
            return false;
        this.saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "" + this.getClass().getSimpleName().toUpperCase() + "\nNúmero: " + numero + 
        "\nNome correntista: " + nomeCorrentista + "\nSaldo: " + saldo;
    }

}