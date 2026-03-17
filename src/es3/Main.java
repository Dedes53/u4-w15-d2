package es3;

import java.util.HashMap;
import java.util.Set;

public class Main {
    private static HashMap<String, String> rubricaTelefonica = new HashMap<>();

    static void main(String[] args) {

        aggiungiContatto("Federico", "3394665372");
        aggiungiContatto("Cicci", "12345673456");

        stampaRubrica();

        cancellaContatto("Federico");
        stampaRubrica();

        System.out.println(trovaNomeDaTelefono("12345673456"));

    }

    public static void aggiungiContatto(String nome, String numeroTelefono) {
        rubricaTelefonica.put(nome, numeroTelefono);
    }

    public static void cancellaContatto(String nome) {
        rubricaTelefonica.remove(nome);
    }

    public static String trovaNomeDaTelefono(String numero) {
        Set<String> nomi = rubricaTelefonica.keySet();
        String risultato = "";

        for (String nome : nomi) {
            if (numero.equals(rubricaTelefonica.get(nome))) risultato = nome;
        }

        return risultato;
    }

    public static void stampaRubrica() {

        for (String nome : rubricaTelefonica.keySet()) {
            System.out.println("Contatto: " + nome + ", Tel: " + rubricaTelefonica.get(nome));
        }
    }


}
