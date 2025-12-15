package day04;

import java.util.HashMap;
import java.util.HashSet;

public class PrimeiroElementoDuplicado {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Fallen");
        hashMap.put(2, "Molodoy");
        hashMap.put(3, "Kscerato");
        hashMap.put(4, "Molodoy");
        hashMap.put(5, "Yuriih");

        HashSet<String> hashSet = new HashSet<>();

        for( String nome : hashMap.values()) {
            if (!hashSet.add(nome)) {
                System.out.println("Elemento duplicado: " + nome);
                break;
            }
        }

    }
}
