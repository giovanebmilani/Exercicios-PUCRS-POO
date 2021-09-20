package atividade_1e2;


public class TestaPonto {
    
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(4, 3);
        Ponto ponto3 = new Ponto(ponto2);
        Ponto ponto4 = new Ponto(4, 10);
        Ponto ponto5 = new Ponto(11, 36);

        System.out.println(Ponto.distanciaEntre(ponto1, ponto2));
        System.out.println(Ponto.distanciaEntre(ponto1, ponto3));
        System.out.println(Ponto.distanciaEntre(ponto2, ponto3));
        System.out.println(Ponto.distanciaEntre(ponto3, ponto4));
        System.out.println(Ponto.distanciaEntre(ponto4, ponto2));
        System.out.println(Ponto.distanciaEntre(ponto5, ponto4));


    }

}
