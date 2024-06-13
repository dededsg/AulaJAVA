package Animais;

public class Cachorro {

    static int numeroDeCachorro;

    private String nome;

    private String cor;

    private int altura;

    private double peso;

    private int tamanhoDoRabo;

    private String estadoDeEspirito;

    //Contrutores
    //contrutor padrão
    public Cachorro(){}
    //contrutores adicionados
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorro ++;
    }
    //métodos


    public static int getNumeroDeCachorro() {
        return numeroDeCachorro;
    }

    public static void setNumeroDeCachorro(int numeroDeCachorro) {
        Cachorro.numeroDeCachorro = numeroDeCachorro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
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

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}


