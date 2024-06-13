import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class strings {
    public static void main(String[] args){

        //String nome = "develin";
        //System.out.println(nome.toUpperCase());
        //System.out.println(nome.toLowerCase());
        //System.out.println(nome.length());

        String nomeOutro = "Develin";
        //System.out.println(nome.equals(nomeOutro));
        //System.out.println(nome.equalsIgnoreCase(nomeOutro));

        // ISO 8681

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        }else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        }else if(agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        }else{
            saudacao = "Olá";
        }
        System.out.println("Olá, ");
        System.out.println(nomeOutro);
        System.out.println("Hoje é ");
        System.out.println(diaSemana);
        System.out.println(saudacao.toUpperCase());



    }
}
