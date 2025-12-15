package day04;

import java.util.HashMap;

public class NameAndAgeMap {
    public static void main(String[] args) {
        var hashmap = new HashMap<String, Integer>();
        hashmap.put("Molodoy", 20);
        hashmap.put("Fallen", 34);
        hashmap.put("Kscerato", 26);
        hashmap.put("Yuriih", 25);
        hashmap.put("Yekindar", 26);

        System.out.println("Idade do molodas: " + hashmap.get("Molodoy"));
    }
}
