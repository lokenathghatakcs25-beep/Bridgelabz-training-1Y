package Runnable;
class Thread7 implements Runnable{
 public void run(){
        System.out.println("i am a thread");
    }
}
class Thread8 implements Runnable{
    public void run(){
        System.out.println("I am a Thread2");
    }
}
public class Eg1 {
    public static void main(String[] args){
        Thread7 t2=new Thread7();
        Thread Gun1=new Thread(t2);
       Thread8 t3=new Thread8();
       Thread Gun2=new Thread(t3);
       Gun1.start();
       Gun2.start();
    }
}
