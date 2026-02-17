package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayParaLista {
    public static void main(String[] args){
        int[] array = new int[2];
        array[0] = 2;
        array[1] = 4;

        List<Integer> lista = new ArrayList<>();

        for(int i=0; i<array.length;i++){
            lista.add(array[i]);
        }

        System.out.println(lista);
    }
}
