package modelo;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String apresentar() {
        return "Sou o professor " + nome + " da disciplina de " + disciplina + ".";
    }
}