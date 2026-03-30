package MultiThreading;
public class Runner {
    static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        Thread thread=new Thread(t1);
        thread.start();
        MyThread5 t2= new MyThread5();
        Thread thread2=new Thread(t2);
        thread2.start();
        Mythread3 t3=new Mythread3();
        Thread thread3=new Thread(t3);
    }
}
