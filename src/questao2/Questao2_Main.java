package questao2;

import modelo.Aluno;

public class Questao2_Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lennon Adolfo de Oliveira", "23197473-5", "Análise e Desenvolvimento de Sistemas");

        System.out.println("=== Questão 2 – Encapsulamento ===");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());

        aluno.setNome("Lennon A. Oliveira");
        System.out.println("Nome alterado: " + aluno.getNome());
    }
}