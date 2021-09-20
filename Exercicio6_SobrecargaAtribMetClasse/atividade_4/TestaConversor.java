package atividade_4;


public class TestaConversor {
    
    public static void main(String[] args) {

        Double res;

        res = Conversor.quilogramaParaLibra(10);

        System.out.println(res);

        res = Conversor.libraParaQuilograma(100);

        System.out.println(res);

        /////////////////////////////////////////////////

        res = Conversor.celciusParaFarenheit(0);

        System.out.println(res);
        
        res = Conversor.farenheitParaCelcius(212);

        System.out.println(res);

        /////////////////////////////////////////////////

        res = Conversor.centimetroParaPes(1000);

        System.out.println(res);

        res = Conversor.pesParaCentimetro(50);

        System.out.println(res);

        /////////////////////////////////////////////////

        res = Conversor.centimetroParaPolegada(100);

        System.out.println(res);

        res = Conversor.polegadaParaCentimetro(50);

        System.out.println(res);

        /////////////////////////////////////////////////

        res = Conversor.quilometrosHoraParaMilhasHora(100);

        System.out.println(res);

        res = Conversor.milhasHoraParaQuilometrosHora(200);

        System.out.println(res);

    }

}
