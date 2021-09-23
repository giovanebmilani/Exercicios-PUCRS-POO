package atividade_3;

public class Tronco extends Embalagem {
    
    public Tronco (int codigo, double custoUnitario, double raio_base, double raio_topo, double altura) {
        super(codigo, custoUnitario);
        setVolumeLiquido(raio_base, raio_topo, altura);
    }

    public boolean setVolumeLiquido(double raio_base, double raio_topo, double altura) {
        if ((raio_base > 0) && (raio_topo > 0) && (altura > 0)){
            this.volumeLiquido =  Math.PI * altura / 3 * (Math.pow(raio_base, 2) + (raio_base * raio_topo) + Math.pow(raio_topo, 2));
            return true;
        }
        return false;
    }

}
