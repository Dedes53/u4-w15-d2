package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    static void main(String[] args) {
        //lista randomica
        int n = 10;
        List<Integer> list = randomList(n);
        System.out.println("Lista ordinata " + list);

        //lista rovesciata
        List<Integer> reversed = reverseList(list);
        System.out.println("Lista ribaltata: " + reversed);

        //elementi pari/dispari
        System.out.print("Valori in posizioni pari: ");
        evenOrOdd(list, false);

        System.out.print("Valori in posizioni dispari: ");
        evenOrOdd(list, true);

    }

    //n interi casuali tra 0 e 100
    static List<Integer> randomList(int n) {
        List<Integer> random = new ArrayList<>();
        Random rndm = new Random();
        for (int i = 0; i < n; i++) {
            int r = rndm.nextInt(0, 101);
            random.add(r);
        }

        Collections.sort(random); //ordino la lista per valore crescente
        return random;
    }


    //raddoppia e inverti gli elementi
    static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reverse = new ArrayList<>();

        reverse.addAll(list); //prima copio la lista passata così com'è

        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }

        return reverse;
    }


    //stampa pari/dispari
    static void evenOrOdd(List<Integer> list, boolean isOdd) {
        int index = isOdd ? 1 : 0;

        for (int i = index; i < list.size(); i += 2) {
            System.out.print(list.get(i) + " "); //invece che println, posso stampare senza andare a capo
        }
        System.out.println();
    }


}
