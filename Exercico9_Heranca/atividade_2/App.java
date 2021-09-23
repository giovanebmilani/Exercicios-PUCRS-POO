package atividade_2;


public class App {
    
    public static void main(String[] args) {

        int[] pesos = {10, 10, 10, 10};
        double custoBagagem;

        // Passagem passagem = new Passagem("041.815.690-55", "Giovane", 1000.0);
        // passagem.defineAssento("15F");

        // double custoBagagem = passagem.custoBagagem(pesos.length, pesos);
        // System.out.printf("\nCusto bagagem: R$ %.2f\n", custoBagagem);
        // System.out.println(passagem);

        //////////////////////////////////////////////////////////////////////////

        Economy passagemEco = new Economy("041.815.690-55", "Giovane", 1000.0);
        passagemEco.defineAssento("15F");

        custoBagagem = passagemEco.custoBagagem(pesos.length, pesos);
        System.out.printf("\nCusto bagagem: R$ %.2f\n", custoBagagem);
        System.out.println(passagemEco);

        //////////////////////////////////////////////////////////////////////////

        Executive passagemExe = new Executive("041.815.690-55", "Giovane", 1000.0);
        passagemExe.defineAssento("15F");

        custoBagagem = passagemExe.custoBagagem(pesos.length, pesos);
        System.out.printf("\nCusto bagagem: R$ %.2f\n", custoBagagem);
        System.out.println(passagemExe);

        //////////////////////////////////////////////////////////////////////////

        Premier passagemPre = new Premier("041.815.690-55", "Giovane", 1000.0);
        passagemPre.defineAssento("15F");

        custoBagagem = passagemPre.custoBagagem(pesos.length, pesos);
        System.out.printf("\nCusto bagagem: R$ %.2f\n", custoBagagem);
        System.out.println(passagemPre);

    }

}   
