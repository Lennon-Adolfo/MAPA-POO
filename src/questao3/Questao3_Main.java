package questao3;

import modelo.Aluno;
import modelo.Professor;

public class Questao3_Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lennon Oliveira", "23197473-5", "Análise e Desenvolvimento de Sistemas");
        Professor professor = new Professor("Carlos Silva", "Programação Orientada a Objetos");

        System.out.println("=== Questão 3 – Herança ===");
        System.out.println(aluno.apresentar());
        System.out.println(professor.apresentar());
    }
}