package esercizio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");
        int nPar = Integer.parseInt(scn.nextLine());
        Set<String> strings = new HashSet<>();
        String parola;
        Set<String> strDup = new HashSet<>();
        for (int i = 0; i < nPar; i++) {
            System.out.println("Scrivi la parola numero " + (i + 1));
            parola = scn.nextLine();
            boolean bool = strings.add(parola);
            if(!bool) {
                strDup.add(parola);
            }
        }


        System.out.println("Le parole duplicate sono " + strDup.size());
        if(!strDup.isEmpty()){
            for(String stringDup : strDup)
                System.out.println(stringDup);
        }
        System.out.println("Ci sono " + strings.size() + " parole e sono le seguenti");
        for (String string: strings){
            System.out.println(string);
        }

    }
}
