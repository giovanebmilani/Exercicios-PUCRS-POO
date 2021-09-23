import java.util.ArrayList;


public class App {
    
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        Produto mousepad = new Produto(101, "Mousepad", 59.9);
        produtos.add(mousepad);
        Eletrodomestico microondas = new Eletrodomestico(102, "Microondas 20L", 699.5, true);
        produtos.add(microondas);
        Eletropesado lavaRoupa = new Eletropesado(103, "Maquina lavadora de roupa 200L", 2245.9);
        produtos.add(lavaRoupa);
        Telefonia celular = new Telefonia(104, "Celular 6' 512gb", 3100.0, true);
        produtos.add(celular);


        for (Produto produto : produtos) {
            System.out.println(produto);
            System.out.println();
        }
    }

}
