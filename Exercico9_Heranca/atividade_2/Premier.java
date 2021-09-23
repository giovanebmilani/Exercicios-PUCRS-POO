package atividade_2;


public class Premier extends Executive {

    public Premier(String cpf, String nome, double custo) {
        super(cpf, nome, custo);
    }

    @Override
    public double custoBagagem(int quantidade, int[] pesos) {
        return super.custoBagagem(quantidade, pesos) * 0.5;
    }

    @Override
    public double defineAssento(String assento) {
        this.assento = assento;
        return 0.0;
    }

    @Override
    public int getMilhas() {
        return (int)(0.2 * this.custoPassagem);
    }

    @Override
    public String toString() {
        return "Premier [assento=" + assento + ", cpf=" + cpf + ", custoPassagem=" + custoPassagem + ", nome=" + nome
                + ", milhas=" + getMilhas() + "]";
    }

}