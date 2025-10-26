package questao5;

import modelo.Aluno;

interface Avaliado {
    String avaliarDesempenho();
}

class AlunoAvaliado extends Aluno implements Avaliado {
    public AlunoAvaliado(String nome, String matricula, String curso) {
        super(nome, matricula, curso);
    }

    @Override
    public String avaliarDesempenho() {
        return "Aluno " + getNome() + " obteve ótimo desempenho!";
    }
}

public class Questao5_Main {
    public static void main(String[] args) {
        AlunoAvaliado aluno = new AlunoAvaliado("Lennon Oliveira", "23197473-5", "Análise e Desenvolvimento de Sistemas");

        System.out.println("=== Questão 5 – Interface ===");
        System.out.println(aluno.avaliarDesempenho());
    }
}