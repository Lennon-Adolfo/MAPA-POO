package questao1;

import modelo.Aluno;

public class Questao1_Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lennon Adolfo de Oliveira", "23197473-5", "Análise e Desenvolvimento de Sistemas");

        System.out.println("=== Questão 1 – Classe e Objeto ===");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}