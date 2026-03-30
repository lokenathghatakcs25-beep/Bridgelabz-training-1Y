 class Thread1 extends Thread {
     public void run() {
         System.out.println("I am thread1");
     }
 }
     class Thread2 extends Thread {
         public void run() {
             System.out.println("I am Thread2");
         }
     }

class M2 {
public static void main(String[] args){
    Thread1 T1 =new Thread1();
    Thread2 T2 = new Thread2();
    T1.start();
    T2.start();
}
}

