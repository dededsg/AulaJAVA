package Animais;

public class Cachorro {
    private String nome;

    private String cor;

    private int altura;

    private double peso;

    private int tamanhoDoRabo;

    private String estadoDeEspirito;

    public String getNome() {

        return this.nome;
    }







    public void comer(){}


    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        //enum

        switch(acao){
            case "carinho": this.estadoDeEspirito = "feliz";break;
            case "vai dormir!": this.estadoDeEspirito = "bravo";break;
            case "pisar na patinha": this.estadoDeEspirito = "triste";break;
            default: this.estadoDeEspirito = "neutro";
        }
        return this.estadoDeEspirito;
    }
}


