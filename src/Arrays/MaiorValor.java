package Arrays;

public class MaiorValor {
    public static void main(String[] args){
        int[] array = new int[3];
        array[0] = 50;
        array[1] = 311;
        array[2] = 25;

        int maior = array[0];

        if(array[1]>maior){
            maior = array[1];
        }

        if(array[2]>maior){
            maior = array[2];
        }

        System.out.println("O maior numero da array é: "+maior);
    }
}
