package atividade_3;
import java.lang.Math;

public class Cilindrica extends Embalagem {
    
    public Cilindrica (int codigo, double custoUnitario, double raio, double altura) {
        super(codigo, custoUnitario);
        setVolumeLiquido(raio, altura);
    }

    public boolean setVolumeLiquido(double raio, double altura) {
        if ((raio > 0) && (altura > 0)){
            this.volumeLiquido = Math.PI * Math.pow(raio, 2) * altura;
            return true;
        }
        return false;
    }

}
