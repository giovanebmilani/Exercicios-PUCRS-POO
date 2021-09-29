

public abstract class Pessoa {
    
    private String cpf;
    private String nome;
    private int idade;

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return this.nome.toUpperCase() + "\n\tCPF: " + this.cpf + "\n\tIdade: " + this.idade;
    }

}
