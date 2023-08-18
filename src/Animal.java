public class Animal {
    
    private String nome, tipo, som;
    private int idade;

    public Animal(String nome, String tipo, String som, int idade){
        this.nome = nome;
        this.tipo = tipo;
        this.som = som;
        this.idade = idade;
    }
    
    public static void main(String[] args){
        Animal animal1 = new Animal("Tico", "Cão", "Au Au!", 5);
        Animal animal2 = new Animal("Joaquim", "Pato", "Quack!", 3);
        Animal animal3 = new Animal("Belo", "Peru", "Glu Glu Glu", 1);

        animal1.mostrarInfo();
        animal2.mostrarInfo();
        animal3.mostrarInfo();

    } 
    
    public void setSom(String som){
        this.som = som;
    }
    public String getSom(){
        return this.som;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Som: " + som);
        System.out.println("Idade: " + idade + " Anos\n");
    }

}
