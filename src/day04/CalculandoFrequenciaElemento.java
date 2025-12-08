package day04;

import java.util.HashMap;

public class CalculandoFrequenciaElemento {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "Fallen");
        hashMap.put(1, "Molodoy");
        hashMap.put(1, "Yekindar");
        hashMap.put(1, "Kscerato");
        hashMap.put(1, "Yurih");
        hashMap.put(1, "Fallen");
        hashMap.put(1, "Fallen");
        hashMap.put(1, "Molodoy");

        System.out.println(hashMap);
    }
}
