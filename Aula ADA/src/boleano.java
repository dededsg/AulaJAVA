public class boleano {
    public static void main(String[] args) {
        //Operadores Boleanos
        boolean resultado = false;
        System.out.println(resultado);


        boolean fimDeSemana = true;
        boolean fazendoSol = false;

        // && = (AND)
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);
        // || = (OR)
        boolean vamosAPraia2 = fimDeSemana || fazendoSol;
        System.out.println(vamosAPraia2);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
