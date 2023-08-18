public class Carro {
    
    // Atributos da Classe
    private String marca, modelo;
    private int ano;
    private boolean estado;

    // Método Construtor da Classe
    public Carro(String marca, String modelo, int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.estado = false;

    }

    // Método Main da Classe
    public static void main(String[] args){

        Carro meuCarro = new Carro("Ford", "Fiesta", 2020);
        
        meuCarro.mostrarInfo();
        meuCarro.ligar();
        meuCarro.mostrarInfo();
        meuCarro.desligar();
        meuCarro.mostrarInfo();

    }

    // Método Ligar da Classe (Liga o Carro)
    public void ligar(){

        this.estado = true;
        System.out.println("Carro Ligado!\n");

    }
    
    // Método desligar da Classe (Desliga o Carro)
    public void desligar(){

        this.estado = false;
        System.out.println("Carro Desligado!\n");

    }

    // Método mostarInfo da Classe (Mostra as Informações do Carro)
    public void mostrarInfo(){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

        if(estado){
            System.out.println("Estado: Ligado\n");
        } else {
            System.out.println("Estado: Desligado\n");
        }

    }

}
