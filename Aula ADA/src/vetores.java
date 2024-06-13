public class vetores {
    public static void main(String[] args) {
        //String[] letras = new String[5];
        //letras[0] = "A";
        //letras[1] = "B";
        //letras[2] = "C";
        //letras[3] = "D";
        //letras[4] = "E";

        //for (int i = 0; i < letras.length; i++){
            //System.out.println(letras[i]);
        //}

        String[] letras = {"A", "B", "C", "D", "E"};
            for(int i=0; i < letras.length; i++){
                System.out.println(letras[i]);
            }

        int[] numeros = {9,10,12,25,2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int j=0; j < numeros.length; j++){
            if(numeros[j] > maior){
                maior = numeros[j];
            }else if(numeros[j] < menor){
                menor = numeros[j];
            }
            media += numeros[j];
        }
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media/numeros.length);
    }
}
