package org.campus02.recap;

import java.util.HashMap;
import java.util.Map;

public class WarenkorbDemo {

    public static void main(String[] args) {
        Warenkorb warenkorb = new Warenkorb();

        Artikel apfel = new Artikel(1, "Apfel", 0.50);
        Artikel apfel2 = new Artikel(1, "Apfel", 0.50);
        Artikel birne = new Artikel(2, "Birne", 1.20);
        Artikel paprika = new Artikel(3, "Paprika", 2.0);

        warenkorb.addArtikel(apfel);
        warenkorb.addArtikel(birne);
        warenkorb.addArtikel(paprika);

        warenkorb.printArtikel();

        warenkorb.removeArtikel(paprika);
        System.out.println();
        warenkorb.printArtikel();

        double sum = warenkorb.calculateSum();
        System.out.println("sum = " + sum);

        double highestPrice = warenkorb.highestPrice();
        System.out.println("highestPrice = " + highestPrice);

        warenkorb.addArtikel(apfel2);
        HashMap<String, Integer> artikelCount = warenkorb.getArtikelCount();

        for (Map.Entry<String, Integer> nameCount : artikelCount.entrySet()) {
            System.out.println(nameCount.getKey() + ": " + nameCount.getValue());
        }

        for (String key : artikelCount.keySet()) {
            System.out.println(key + ": " + artikelCount.get(key));
        }
    }
}
