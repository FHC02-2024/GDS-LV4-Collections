package org.campus02.recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Warenkorb {

    private ArrayList<Artikel> artikelListe = new ArrayList<>();

    public void addArtikel(Artikel artikel) {
        artikelListe.add(artikel);
    }

    public void printArtikel() {
        // erste Möglichkeit einer Iteration
        for (Artikel a : artikelListe) {
            System.out.println(a);
        }

        // zweite Möglichkeit
//        for (int i = 0; i < artikelListe.size(); i++) {
//            Artikel a = artikelListe.get(i);
//            System.out.println(a);
//        }
    }

    public void removeArtikel(Artikel artikel) {
        artikelListe.remove(artikel);
    }

    public double calculateSum() {
        // initialwert für summe festlegen
        double sum = 0.0;

        // iter
        for (Artikel artikel : artikelListe) {
            sum += artikel.getPrice();
        }

        return sum;
    }

    public double highestPrice() {
//        double highestPrice = 0.0;
        double highestPrice = Double.MIN_VALUE;
        for (Artikel artikel : artikelListe) {
            if (highestPrice < artikel.getPrice()) {
                highestPrice = artikel.getPrice();
            }
        }
        return highestPrice;
    }

    public HashSet<Artikel> getUniqueArtikel() {
        HashSet<Artikel> uniqueArtikel = new HashSet<>();
        for (Artikel artikel : artikelListe) {
            uniqueArtikel.add(artikel);
        }
        return uniqueArtikel;
    }

    public ArrayList<Artikel> getUniqueArtikelList() {
        ArrayList<Artikel> uniqueArtikelList = new ArrayList<>();
        for (Artikel artikel : artikelListe) {
            if (!uniqueArtikelList.contains(artikel)) {
                uniqueArtikelList.add(artikel);
            }
        }
        return uniqueArtikelList;
    }

    public HashSet<Artikel> getUniqueArtikel2() {
        return new HashSet<>(artikelListe);
    }

    public HashMap<String, Integer> getArtikelCount() {
        // key -> Artikelnamen (zB: Apfel)
        // value -> Anzahl der Artikel auf dem Warenkorb (zB: 3)
        HashMap<String, Integer> artikelCountMap = new HashMap<>();
        for (Artikel artikel : artikelListe) {
            // Ist der Artikel bereits auf der Map
            // wenn ja -> counter hochzählen
            // wenn nein -> Artikel das erste Mal auf die Map legen und counter auf 1 setzen

            if (artikelCountMap.containsKey(artikel.getName())) {
                int count = artikelCountMap.get(artikel.getName());
                int newCount = count + 1;
                artikelCountMap.put(artikel.getName(), newCount);
//                artikelCountMap.put(artikel.getName(), count + 1);
            } else {
                artikelCountMap.put(artikel.getName(), 1);
            }
        }

        return artikelCountMap;
    }
}
