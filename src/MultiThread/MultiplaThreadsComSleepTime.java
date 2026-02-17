package MultiThread;

import java.util.Random;

public class MultiplaThreadsComSleepTime {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {

            int id = i;

            threads[i] = new Thread(() -> {
                try {
                    int tempo = random.nextInt(2000) + 500;

                    System.out.println("Thread " + id + " iniciou");

                    Thread.sleep(tempo);

                    System.out.println("Thread " + id + " terminou após " + tempo + " ms");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            threads[i].start();
        }

        // Espera todas terminarem
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Todas as threads finalizaram");
    }
}