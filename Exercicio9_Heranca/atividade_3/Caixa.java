package atividade_3;

public class Caixa extends Embalagem {

    public Caixa (int codigo, double custoUnitario, double lado1, double lado2, double altura) {
        super(codigo, custoUnitario);
        setVolumeLiquido(lado1, lado2, altura);
    }

    public boolean setVolumeLiquido(double lado1, double lado2, double altura) {
        if ((lado1 > 0) && (lado2 > 0) && (altura > 0)){
            this.volumeLiquido = lado1 * lado2 * altura;
            return true;
        }
        return false;
    }
    
}
