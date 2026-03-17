package es1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<String> single = new HashSet<>(); //parole single
        Set<String> duplicated = new HashSet<>(); //parole doppie

        try {
            System.out.println("Indica il numero di parole che desideri inserire");
            int n = scan.nextInt();
            scan.nextLine(); //buona prassi dopo nextInt()

            if (n <= 0) {
                System.out.println("Dai eh, il numero deve essere maggiore di 0, altrimenti cosa ci stiamo a fare qui!");
                return;
            }

            for (int i = 1; i <= n; i++) {
                System.out.println("Inserisci la parola n." + i + ": ");
                String word = scan.nextLine().trim();

                if (word.isEmpty()) {
                    System.out.println("Dai, inserisci una parola valida almeno");
                    i--;
                    continue;
                }

                boolean isAdded = single.add(word); //add() ritorna falso se parola è già presente nella lista

                if (!isAdded) duplicated.add(word); //quindi la aggiungo alla lista delle doppie
            }

            System.out.println("\nParole doppie: " + duplicated); //stampa parole doppie
            System.out.println("Numero parole single: " + single.size()); //stampa numero degli elementi in single
            System.out.println("Elenco delle parole single: " + single);
        } catch (InputMismatchException e) {
            System.out.println("Ma secondo te, potrai aggiungere una parola non intera?!");
        } finally {
            scan.close();
        }


    }
}
