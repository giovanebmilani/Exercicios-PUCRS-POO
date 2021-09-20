package atividade_3;

import java.lang.Math;


public class Geometria {
    
    public static double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public static double areaEsfera(double raio) {
        return 4.0 * Math.PI * Math.pow(raio, 2);
    }

    public static double volumeCilindro(double raio, double altura) {
        return Geometria.areaEsfera(raio) * altura;
    }

    public static double volumeCone(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura / 3.0;
    }

}
