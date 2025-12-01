package day02;

import java.util.ArrayList;

public class ContarElementosMaioresQue10 {
    public static void main(String[] args){
        int[] array = new int[3];
        array[0] = 5;
        array[1] = 30;
        array[2] = 25;

        int maiorQue10 = 0;

        for (int i=0;i<array.length;i++){
            if(array[i] > 10){
                maiorQue10++;
            }
        }

        System.out.printf("A array possui %d elementos maiores que 10", maiorQue10);
    }
}
