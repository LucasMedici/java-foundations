package day03;

import java.util.ArrayList;

public class ValorExisteNaLista {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);

        int c = 4;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == c) {
                System.out.printf("O valor %d já existe na lista!", c);
            }
        }
    }
}
