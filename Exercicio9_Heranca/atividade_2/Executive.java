package atividade_2;


public class Executive extends Passagem {

    public Executive(String cpf, String nome, double custo) {
        super(cpf, nome, custo);
    }

    @Override
    public double custoBagagem(int quantidade, int[] pesos) {
        if (quantidade <= 2){
            return super.custoBagagem(0, pesos);}
        return super.custoBagagem(quantidade-2, pesos);
    }

    public int getMilhas() {
        return (int)(0.1 * this.custoPassagem);
    }

    @Override
    public String toString() {
        return "Executive [assento=" + assento + ", cpf=" + cpf + ", custoPassagem=" + custoPassagem + ", nome=" + nome
                + ", milhas=" + getMilhas() + "]";
    }

}