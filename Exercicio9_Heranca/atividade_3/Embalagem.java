package atividade_3;


public abstract class Embalagem {

    protected int codigo;
    protected double custoUnitario;
    protected double volumeLiquido;

    public Embalagem(int codigo, double custoUnitario) {
        this.codigo = codigo;
        this.custoUnitario = custoUnitario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getCustoUnitario() {
        return this.custoUnitario;
    }

    public double getVolumeLiquido() {
        return this.volumeLiquido;
    }

    @Override
    public String toString() {
        return "Embalagem [Codigo: " + codigo + ", Modelo: " + this.getClass().getName() 
        + ", Custo Unitario: " + custoUnitario + ", Volume Liquido: " + volumeLiquido
        + "]";
    }


}