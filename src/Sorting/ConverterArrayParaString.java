package Sorting;

import java.util.ArrayList;
import java.util.List;

public class ConverterArrayParaString {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 10, 15, 20));
        String string = arrayList.toString();
        System.out.println(string);

    }
}
