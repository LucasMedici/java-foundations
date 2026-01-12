package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayListComCollectionsSort {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(12, 7, 10, 22, 2, 15));
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
