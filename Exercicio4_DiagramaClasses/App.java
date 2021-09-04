

public class App {
    
    public static void main(String[] args) {
        
        Produto celular = new Produto(1, "Celular 128gb", 5000.0);
        Produto celular2 = new Produto(1, "Celular 128gb", 5000.0);
        Produto tv = new Produto(2, "TV 50'", 2000.0);
        Produto coca_cola = new Produto(3, "Coca-Cola 2l", 6.99);

        /** Testes catálogo */
        Catalogo catalogo = new Catalogo();

        catalogo.cadastra(celular);
        catalogo.cadastra(tv);
        catalogo.cadastra(coca_cola);

        //System.out.println();

        /** Testes estoque */
        Estoque estoque = new Estoque();
        
        estoque.adicionaProduto(celular2, 37);
        estoque.adicionaProduto(tv, 14);
        estoque.adicionaProduto(coca_cola, 220);

        //System.out.println();
        System.out.println();


    }

    public static void abrirVenda() {

    }

    public static void inserirItem() {

    }

    public static void removerItem(int numero) {

    }

    public static void fecharVenda() {

    }

    public static void listarUltimasVendas() {

    }

    public static void listarVenda(int numeroRecibo) {

    }

}
