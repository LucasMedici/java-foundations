package day02;

public class CalcularMediaValores {
    public static void main(String[] args){
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        int soma=0;

        for (int i=0; i<array.length;i++){
            soma = soma+array[i];
        }

        int media = soma/array.length;
        System.out.println(media);

    }
}
