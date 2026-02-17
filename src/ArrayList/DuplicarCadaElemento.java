package ArrayList;

import java.util.ArrayList;

public class DuplicarCadaElemento {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("ArrayList Inicial: "+ arrayList);

        for(int i=0; i<arrayList.size(); i+=2 ){
            arrayList.add(i+1, arrayList.get(i));
        }

        System.out.println("Array Final" + arrayList);

    }
}
