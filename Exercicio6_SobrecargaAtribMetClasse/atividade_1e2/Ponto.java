package atividade_1e2;
import java.lang.Math;


public class Ponto {

    private int pontoX;
    private int pontoY;

    public Ponto() {
        this.pontoX = 0;
        this.pontoY = 0;
    }

    public Ponto(int x, int y) {
        this.pontoX = x;
        this.pontoY = y;
    }

    public Ponto(Ponto ponto) {
        this.pontoX = ponto.getPontoX();
        this.pontoY = ponto.getPontoY();
    }

    public int getPontoX() {
        return this.pontoX;
    }

    public int getPontoY() {
        return this.pontoY;
    }

    public static double distanciaEntre(Ponto ponto1, Ponto ponto2) {
        int distanciaEixoX = Math.abs(ponto1.getPontoX() - ponto2.getPontoX());
        int distanciaEixoY = Math.abs(ponto1.getPontoY() - ponto2.getPontoY());

        double distancia = Math.sqrt(Math.pow(distanciaEixoX, 2) + Math.pow(distanciaEixoY, 2));

        return distancia;
    }

}