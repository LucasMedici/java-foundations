package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListaDeNumerosAoQuadradoComMultiplasThreads {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        int[] lista = new int[5];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        lista[3] = 4;
        lista[4] = 5;

        for(int i=0; i<lista.length; i++){
            int finalI = i;
            executorService.submit(() -> {
                System.out.println(lista[finalI]*lista[finalI] + "Feito na Thread: " + Thread.currentThread().getName());
            });
        }

    }
}
