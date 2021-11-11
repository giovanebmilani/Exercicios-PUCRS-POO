public class App {
    public static void main(String args[]) {
        Venda v = new Venda();
        try {
            System.out.println(v.insereItem(10, 5));
        } catch(ProductNotFound e) {
            System.out.println("Erro: " + e.getMessage());
        } catch(ProductOutOfStock e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Quantidade máxima permitida: " + e.getQuantidadeDisponivel());
        }
        System.out.println("Fim");
    }
}
