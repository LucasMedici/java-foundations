package Strings_StringBuilder;

import java.util.HashMap;

public class CalcularVogaisEmString {
    public static void main(String[] args){
        HashMap<String, Integer> mapVogais = new HashMap<>();
        mapVogais.put("a", 0);
        mapVogais.put("e", 0);
        mapVogais.put("i", 0);
        mapVogais.put("o", 0);
        mapVogais.put("u", 0);

        String palavra = "alemanha";

        for(int i=0; i<palavra.length(); i++){
            if(mapVogais.containsKey(String.valueOf(palavra.charAt(i)))){
                String letra = String.valueOf(palavra.charAt(i));
                mapVogais.put(letra, mapVogais.getOrDefault(letra, 0)+1);
            }
        }

        System.out.println(mapVogais);

    }
}
