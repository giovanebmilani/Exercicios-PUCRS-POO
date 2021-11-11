import java.util.Scanner;


public class Fatorial {
    private static int execucoes = 0;
    private static int erros = 0;

    public static double fatorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x precisa ser >= 0");
        }
        double fact;
        for (fact = 1.0; x > 1; x--) {
            fact = fact * x;
        }
        return fact;
    }

    public static void executa() throws InterruptedException {
        int continua = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Digite o valor para o calculo: ");
            int x = sc.nextInt();
            try {
                double result = fatorial(x);
                System.out.println("Fatorial de " + x + " = " + result);
            } catch(IllegalArgumentException e) {
                erros++;
                System.out.println(e.getMessage());
                throw new IllegalArgumentException("Excecao foi tratada", e);
            } finally {
                execucoes++;
            }
            //System.out.println("Digite 0 para sair ou 1 para continuar.");
            //continua = sc.nextInt();
            Thread.sleep(3000);
        } while (continua != 0);
    }

    public static void main(String[] args) throws InterruptedException {
        // try {
        //     executa();
        // } catch(IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }
        executa();
        System.out.println("Fim");
    }
}
