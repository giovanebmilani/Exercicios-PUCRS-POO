package atividade_3;

public class TestaGeometria {
    
    public static void main(String[] args) {

        double res = Geometria.volumeEsfera(2);

        System.out.println(res);

        res = Geometria.areaEsfera(3);

        System.out.println(res);

        res = Geometria.volumeCilindro(3, 5);

        System.out.println(res);

        res = Geometria.volumeCone(10, 15);

        System.out.println(res);

    }

}
