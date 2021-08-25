

public class App {
    public static void main(String args[]){
        Cofrinho c = new Cofrinho();

        c.inserirMoeda(new Moeda(NomeMoeda.UmReal));
        c.inserirMoeda(new Moeda(NomeMoeda.CinquentaCentavos));
        c.inserirMoeda(new Moeda(NomeMoeda.VinteCincoCentavos));
        c.inserirMoeda(new Moeda(NomeMoeda.UmReal));
        c.inserirMoeda(new Moeda(NomeMoeda.CincoCentavos));
        c.inserirMoeda(new Moeda(NomeMoeda.CinquentaCentavos));
        c.inserirMoeda(new Moeda(NomeMoeda.UmReal));
        c.inserirMoeda(new Moeda(NomeMoeda.DezCentavos));
        c.inserirMoeda(new Moeda(NomeMoeda.UmCentavo));
        c.inserirMoeda(new Moeda(NomeMoeda.VinteCincoCentavos));
        c.inserirMoeda(new Moeda(NomeMoeda.UmReal));

        System.out.println("Quantidade de moedas inseridas: " + c.getQuantidadeMoedas());
        System.out.println("Quantidade de moedas de 1 real: " + c.getQuantidadeMoedasTipo(NomeMoeda.UmReal));
        System.out.println("Quantidade de moedas de 50 centavos: " + c.getQuantidadeMoedasTipo(NomeMoeda.CinquentaCentavos));
        System.out.println("Valor total em centavos: " + c.getValorTotalCentavos());
        System.out.println("Valor total em reais: " + c.getValorTotalReais());
        System.out.println("Moeda retirada: " + c.removerMoeda());
        System.out.println("Moeda retirada: " + c.removerMoeda());
        System.out.println("Valor total em centavos: " + c.getValorTotalCentavos());
    }
}
