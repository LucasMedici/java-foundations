package HashMap_HashSet;

import java.util.HashMap;

public class StringsSaoAnagramas {
    public static void main(String[] args){
        String palavra1 = "amor";
        String palavra2 = "roma";

        System.out.println(saoAnagramas(palavra1, palavra2));
    }

    public static boolean saoAnagramas(String p1, String p2){
        if(p1.length() != p2.length()){
            return false;
        }

        HashMap<Character, Integer> hashPalavra1 = new HashMap();
        char[] charArray = p1.toCharArray();
        for(char c: charArray){
            hashPalavra1.put(c, hashPalavra1.getOrDefault(c, 0)+1);
        }

        char[] charArray2 = p2.toCharArray();
        for(char c2: charArray2){
            hashPalavra1.put(c2, hashPalavra1.getOrDefault(c2, 0)-1);
            if(hashPalavra1.get(c2) < 0){
                return false;
            }
        }





        return true;
    }
}
