package org.campus02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionaryMap {

    public static void main(String[] args) {
        // K -> String (deutscher Begriff)
        // V -> String (englischer Begriff)

        HashMap<String, String> deToEnDict = new HashMap<>();
        deToEnDict.put("Katze", "cat");
        deToEnDict.put("Hund", "dog");
        deToEnDict.put("Hunde", "dogs");
        deToEnDict.put("Löwe", "lion");

        // Zugriff -> über den Schlüssel
        String hundInEnglish = deToEnDict.get("Hund");
        System.out.println("hundInEnglish = " + hundInEnglish);


        // iterieren über keyset
        Set<String> keys = deToEnDict.keySet();
        for (String k : keys) {
            System.out.println("k = " + k);
            String wordInEnglish = deToEnDict.get(k);
            System.out.println("wordInEnglish = " + wordInEnglish);
        }

        // iterieren übers entry set
        // generieren mittels iter
        for (Map.Entry<String, String> entry : deToEnDict.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
