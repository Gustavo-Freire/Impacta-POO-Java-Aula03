package classeAluno;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    public void mostrarInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");

    }
}
