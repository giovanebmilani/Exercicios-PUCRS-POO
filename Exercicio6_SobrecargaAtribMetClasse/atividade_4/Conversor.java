package atividade_4;

public class Conversor {
    
    public static double quilogramaParaLibra(double valor) {
        return valor * 2.2046;
    }

    public static double libraParaQuilograma(double valor) {
        return valor / 2.2046;
    }

    public static double celciusParaFarenheit(double valor) {
        return (valor * 9 / 5) + 32;
    }

    public static double farenheitParaCelcius(double valor) {
        return (valor - 32) * 5 / 9;
    }

    public static double centimetroParaPes(double valor) {
        return valor / 30.48;
    }

    public static double pesParaCentimetro(double valor) {
        return valor * 30.48;
    }

    public static double centimetroParaPolegada(double valor) {
        return valor / 2.54;
    }

    public static double polegadaParaCentimetro(double valor) {
        return valor * 2.54;
    }

    public static double quilometrosHoraParaMilhasHora(double valor) {
        return valor * 1.609;
    }

    public static double milhasHoraParaQuilometrosHora(double valor) {
        return valor / 1.609;
    }
    

}
