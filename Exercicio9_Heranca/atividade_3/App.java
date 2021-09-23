package atividade_3;


public class App {
    
    public static void main(String[] args) {

        Caixa caixa = new Caixa(1001, 0.15, 5.5, 5.5, 10.1);
        System.out.println(caixa);

        Cilindrica cilindrica = new Cilindrica(1002, 0.25, 2.35, 8.0);
        System.out.println(cilindrica);

        Conica conica = new Conica(1003, 0.3, 2.35, 8.0);
        System.out.println(conica);

        Tronco tronco = new Tronco(1004, 0.5, 5.35, 2.55, 8.0);
        System.out.println(tronco);

    }

}
