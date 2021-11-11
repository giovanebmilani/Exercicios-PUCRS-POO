public class Divide {
    // public static double divide(int a, int b) {
    //     try {
    //         double resp = a/b; // se b == 0 lança ArithmeticException 
    //         return resp;
    //     } catch(ArithmeticException e) {
    //         System.out.println("Divisao por zero");
    //         return -1;
    //     }
    // }
    
    public static double divide(int a, int b) {
        double resp = a/b; // se b == 0 lança ArithmeticException 
        return resp;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        try {   
            double result = divide(n1, n2);
            System.out.println("Resultado: " + result);
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Fim");
    }
}
