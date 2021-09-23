package atividade_4;

public class App {
 
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(101, "Giovane");
        conta.deposito(1000.0);
        conta.sacar(1);
        System.out.println(conta);
        System.out.println();
        
        
        ContaRemunerada contaRem = new ContaRemunerada(102, "João");
        contaRem.deposito(1000.0);
        contaRem.sacar(100.0);
        System.out.println(contaRem);
        System.out.println();

        ContaComLimite contaLim = new ContaComLimite(103, "Maria");
        contaLim.deposito(1000.0);
        contaLim.setLimite(500.0);
        contaLim.sacar(1300.0);
        contaLim.deposito(500.0);
        contaLim.quitaJuros();
        contaLim.sacar(589.5);
        contaLim.deposito(469.89);
        System.out.println(contaLim);
        System.out.println();

    }

}
