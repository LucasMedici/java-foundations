package MultiThread;

public class PrintMensagensEmDiferentesThreads {
    public static void main(String[] args){
        Thread thread1 = new Thread(() -> System.out.println("Mensagem 1, " + Thread.currentThread().getName()));
        Thread thread2 = new Thread(() -> System.out.println("Mensagem 2, " + Thread.currentThread().getName()));
        thread1.start();
        thread2.start();

    }
}
