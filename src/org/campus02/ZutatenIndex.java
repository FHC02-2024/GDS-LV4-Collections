package org.campus02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ZutatenIndex {

    public static void main(String[] args) {
        // Key -> Zutat (String)
        // Value -> Liste von Seiten (List<Integer>)

        HashMap<String, ArrayList<Integer>> zutatenIndex = new HashMap<>();
        ArrayList<Integer> mehlSeiten = new ArrayList<>();
        mehlSeiten.add(3);
        mehlSeiten.add(5);

        zutatenIndex.put("Mehl", mehlSeiten);
        ArrayList<Integer> mehlSeitenVonMap = zutatenIndex.get("Mehl");

        // hinzufügen
        mehlSeitenVonMap.add(6);

        zutatenIndex.put("Zucker", new ArrayList<>());
        ArrayList<Integer> zuckerListe = zutatenIndex.get("Zucker");
        zuckerListe.add(8);

        for (Map.Entry<String, ArrayList<Integer>> entry : zutatenIndex.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
