package atividade_2;


public abstract class Passagem {

    protected String cpf;
    protected String nome;
    protected String assento;
    protected double custoPassagem;
    private final double CUSTO_ASSENTO = 5.0;

    public Passagem(String cpf, String nome, double custo) {
        this.cpf = cpf;
        this.nome = nome;
        this.custoPassagem = custo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAssento() {
        return this.assento;
    }

    public double getCustoPassagem() {
        return this.custoPassagem;
    }

    public double custoBagagem(int quantidade, int[] pesos) {
        double custoBagagem = 0.0;
        for (int i = 0; i < quantidade; i++)
            custoBagagem += pesos[i] * 0.5;
        this.custoPassagem += custoBagagem;
        return custoBagagem;
    }

    public double defineAssento(String Assento) {
        this.assento = Assento;
        this.custoPassagem += this.CUSTO_ASSENTO;
        return this.CUSTO_ASSENTO;
    }

    @Override
    public String toString() {
        return "Passagem [assento=" + assento + ", cpf=" + cpf + ", custoPassagem=" + custoPassagem + ", nome=" + nome
                + "]";
    }    

}