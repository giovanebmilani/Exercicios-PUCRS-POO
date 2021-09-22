

public class Economy extends Passagem {
    
    public Economy(String cpf, String nome, double custo) {
        super(cpf, nome, custo);
    }

    @Override
    public double custoBagagem(int quantidade, int[] pesos) {
        double custoBagagem = 10 * quantidade; // 10 para cada bagagem
        this.custoPassagem += custoBagagem;
        custoBagagem += super.custoBagagem(quantidade, pesos); // mais o custo por peso
        return custoBagagem;
    }

    @Override
    public String toString() {
        return "Economy [assento=" + assento + ", cpf=" + cpf + ", custoPassagem=" + custoPassagem + ", nome=" + nome
                + "]";
    }

}
