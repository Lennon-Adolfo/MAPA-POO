package questao4;

import modelo.Pessoa;
import modelo.Aluno;
import modelo.Professor;

public class Questao4_Main {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno("Lennon Oliveira", "23197473-5", "Análise e Desenvolvimento de Sistemas");
        Pessoa professor = new Professor("Carlos Silva", "Programação Orientada a Objetos");

        System.out.println("=== Questão 4 – Polimorfismo ===");
        System.out.println(aluno.apresentar());
        System.out.println(professor.apresentar());
    }
}