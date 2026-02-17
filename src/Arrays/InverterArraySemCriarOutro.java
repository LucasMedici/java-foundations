package Arrays;

public class InverterArraySemCriarOutro {
    public static void main(String[] args){
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        int i = 0;
        int f = array.length-1;

        while (i<f){
            int auxiliar = array[i];
            array[i] = array[f];
            array[f] = auxiliar;
            i++;
            f--;
        }

        for (int c : array){
            System.out.println(c);

        }


    }
}
