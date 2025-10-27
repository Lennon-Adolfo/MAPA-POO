# MapaPOO - Atividade MAPA POO

## Descrição
Este repositório contém a atividade MAPA de **Programação Orientada a Objetos (POO)** da Unicesumar. O projeto implementa classes, objetos, herança, polimorfismo e interfaces em Java, utilizando **dados reais do autor** para fins de teste.

---

## Estrutura do Projeto

src/
├── modelo/
│ ├── Pessoa.java
│ ├── Aluno.java
│ └── Professor.java
│
├── questao1/
│ └── Questao1_Main.java
│
├── questao2/
│ └── Questao2_Main.java
│
├── questao3/
│ └── Questao3_Main.java
│
├── questao4/
│ └── Questao4_Main.java
│
└── questao5/
└── Questao5_Main.java


- **modelo/**: contém as classes base (`Pessoa`, `Aluno`, `Professor`).  
- **questao1 a questao5/**: contém os arquivos `Main` de cada questão, testando os conceitos.

---

## Questões Implementadas

### Questão 1 – Classe e Objeto
- Criada a classe `Aluno` com atributos `nome` e `matricula`.  
- Instanciado um objeto com os próprios dados.  
- Saída esperada:

- Nome: Lennon Adolfo de Oliveira
Matrícula: 23197473-5
<img width="1365" height="721" alt="printquestao1" src="https://github.com/user-attachments/assets/4b3eedb5-cb7a-4b0b-97c6-6e72b08aff82" />

### Questão 2 – Encapsulamento
- Atributos da classe `Aluno` tornados privados.  
- Criados getters e setters.  
- Teste de alteração do nome do aluno.
- 
Nome alterado: Lennon A. Oliveira

<img width="1365" height="721" alt="printquestao2" src="https://github.com/user-attachments/assets/8decdb38-d70d-45b9-8192-acace2015a50" />


### Questão 3 – Herança
- Criada a classe `Pessoa` como superclasse.  
- `Aluno` e `Professor` herdam de `Pessoa`.  
- Teste de criação de objetos e exibição dos atributos.

### Questão 4 – Polimorfismo
- Método `apresentar()` sobrescrito em `Aluno` e `Professor`.  
- Demonstração de polimorfismo chamando `apresentar()` para objetos de tipo `Pessoa`.

### Questão 5 – Interface
- Criada interface `Avaliado` com método `avaliarDesempenho()`.  
- `Aluno` implementa a interface.  
- Teste do método para o objeto `Aluno`.
Aluno Lennon Oliveira obteve ótimo desempenho!

<img width="1365" height="717" alt="printquestao5" src="https://github.com/user-attachments/assets/4038b5c8-fc3c-4ea8-b791-9f2ce85b2eff" />

---

## Como Executar

1. Abrir o projeto no IntelliJ IDEA (ou outra IDE Java).  
2. Compilar todos os pacotes.  
3. Executar cada `QuestaoX_Main.java` para ver o resultado no console.

---

## Evidências
- Inserir aqui os prints das execuções de cada questão.

---

## Autor
- **Lennon Adolfo de Oliveira**  
- Curso: Tecnólogo em Análise e Desenvolvimento de Sistemas  
- GitHub: [https://github.com/Lennon-Adolfo](https://github.com/Lennon-Adolfo)


