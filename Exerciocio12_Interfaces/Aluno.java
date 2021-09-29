import java.util.ArrayList;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;
    private ArrayList<Double> notas = new ArrayList<Double>();

    public Aluno(int matricula, String cpf, String nome, int idade) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return this.notas;
    }

    public Boolean addNota(Double nota) {
        if (nota < 0.0)
            return false;
        if (nota > 10.0)
            return false;
        return this.notas.add(nota);
    }

    public Double getMediaNotas() {
        Double sum = 0.0;
        for (Double nota : this.notas)
            sum += nota;
        return sum / this.notas.size();
    }

    public Boolean aprovado() {
        if (this.getMediaNotas() > 7.0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().toUpperCase() + " " + super.toString() + 
        "\n\tMatrícula: " + this.matricula + "\n\tCurso: " + this.curso + "\n\tNotas: " + 
        this.notas + "\n\tMédia: " + String.format("%.2f", this.getMediaNotas()) + "\n\tAprovado: " + this.aprovado() + "\n";
    }

}