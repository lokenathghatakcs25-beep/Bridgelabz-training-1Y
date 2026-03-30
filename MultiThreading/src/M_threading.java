class MyThread1 implements Runnable{
    public void run(){
        System.out.println("I am a thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        System.out.println(" i am a thread2 ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
 class M1 {
    public static void main(String[] args){
        MyThread1 bullet1=new MyThread1();
        Thread gun1=new Thread(bullet1);
        MyThread2 bullet2=new MyThread2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}