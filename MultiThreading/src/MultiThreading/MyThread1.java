package MultiThreading;

public class MyThread1 implements Runnable {

    public void run()
    {
        for(int i=0;i<=5;i++) {
            System.out.println("Lokenath");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
