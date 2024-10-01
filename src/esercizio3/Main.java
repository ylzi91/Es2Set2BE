package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static Map<String, String> rubs = new HashMap<>();
    public static void main(String[] args) {
        Contatti contatto1 = new Contatti("Lollo", "333000340");
        Contatti contatti2 = new Contatti("Foffo", "3445325435");
        Contatti contatti3 = new Contatti("Fodsfo", "3445325233e2435");
        nomeTel(contatto1);
        nomeTel(contatti2);
        nomeTel(contatti3);
        deleteNum(contatti2.getNome());
        searchByName(contatti3.getNome());
        System.out.println(rubs);
        printAll();
    }

    public static void nomeTel(Contatti contatto){
        rubs.put(contatto.getNome(), contatto.getTelefono());
    }
    public static void deleteNum(String name){
        rubs.remove(name);
    }
    public static void searchByName(String name){
        System.out.println("Il numero di " + name + " è " + rubs.get(name));
    }

    public static void printAll(){
        Set<String> chiaviRubs = rubs.keySet(); // Mi ritorna un Set perché le chiavi sono tutte univoche
        for (String chiave : chiaviRubs) {
            System.out.println("Chiave: " + chiave);
            System.out.println("Valore: " + rubs.get(chiave));
        }
    }
}
