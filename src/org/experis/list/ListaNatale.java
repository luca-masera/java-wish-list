package org.experis.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ListaNatale {
    public static void main(String[] args) {
        //SCANNER
        Scanner scan= new Scanner(System.in);
        //ARRAY LIST DOVE VERRANNO AGGIUNTI I REGALI

        ArrayList<String> lista= new ArrayList<>();

        //INDICATORE
        boolean go= true;

        //CICLO PER CHIEDERE ALL'UTENTE QUALI E SE VUOLE ANCORA REGALI
        while(go){
            System.out.println("Quale regalo vuoi?");
            String regalo= scan.nextLine();
            lista.add(regalo);

            System.out.println("La lunghezza della lista è: " + lista);

            System.out.println("Vuoi aggiungere altri regali?(si/no)");
            String answer = scan.nextLine();
            //SE SCEGLIE NO L'INDICATORE DIVENTERà FALSE E USCIRà DAL CICLO
            if (!answer.equalsIgnoreCase("si")){
                go=false;
            }
        }

        //USO SORT PER ORDINARE LA LISTA
        Collections.sort(lista);

        //CON IL CICLO GUARDO QUALI REGALI CI SONO DENTRO LA LISTA E POI LI STAMPO
        System.out.println("Lista dei regali ordinata:");
        for (String regalo : lista) {
            System.out.println(regalo);
        }


    }
}


