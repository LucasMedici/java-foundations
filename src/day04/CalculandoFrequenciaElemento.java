package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CalculandoFrequenciaElemento {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "Fallen");
        hashMap.put(2, "Molodoy");
        hashMap.put(3, "Yekindar");
        hashMap.put(4, "Kscerato");
        hashMap.put(5, "Yurih");
        hashMap.put(6, "Fallen");
        hashMap.put(7, "Fallen");
        hashMap.put(8, "Molodoy");

        HashMap<String, Integer> frequencia = new HashMap<>();

        for (String nome : hashMap.values()) {
            frequencia.put(nome, frequencia.getOrDefault(nome, 0) + 1);
        }

        System.out.println(frequencia);
    }
}
