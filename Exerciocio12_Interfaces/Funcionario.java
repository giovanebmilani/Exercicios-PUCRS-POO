

public class Funcionario extends Pessoa{
    
    private int matricula;
    private Double salario;

    public Funcionario(int matricula, String cpf, String nome, int idade, Double salario) {
        super(cpf, nome, idade);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public Double getSalario() {
        return this.salario;
    }

    public Boolean setSalario(Double salario) {
        if (salario < 0)
            return false;
        this.salario = salario;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().toUpperCase() + " " + super.toString() + 
        "\n\tMatrícula: " + this.matricula + "\n\tSalário: R$ " + this.salario + "\n";
    }

}
