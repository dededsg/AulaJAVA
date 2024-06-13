import Animais.Cachorro;

public class classesNExecutaveis {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex","Branco",25,10.5,5,"nada");

        Cachorro cachorro2 = new Cachorro("Puppy","Branco",25,10.5,5,"nada");

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        System.out.println("--------------------------");

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        // 14:29 modelagem orientada a objetos














        //System.out.println(cachorro2.getNome());
        //System.out.println(cachorro2.getPeso());
        //System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        //System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        //System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
        //System.out.println("O cachorro está " + cachorro1.interagir("nada"));

    }
}
