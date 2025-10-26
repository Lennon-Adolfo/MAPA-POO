package modelo;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        super(nome); // inicializa nome na superclasse
        this.matricula = matricula;
        this.curso = curso;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String apresentar() {
        return "Sou o aluno " + nome + " do curso de " + curso + ".";
    }
}