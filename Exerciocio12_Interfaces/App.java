

public class App {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno(1127821986,"041.815.690-55", "Giovane Bianchi", 18);
        aluno.setCurso("Engenharia de Software");
        aluno.addNota(9.4);
        aluno.addNota(8.9);
        aluno.addNota(8.5);
        aluno.addNota(11.0);

        System.out.println(aluno);

        Funcionario func = new Funcionario(284173489, "442.487.001-19", "Neymar", 29, 1835784.0);

        System.out.println(func);
    }

}
