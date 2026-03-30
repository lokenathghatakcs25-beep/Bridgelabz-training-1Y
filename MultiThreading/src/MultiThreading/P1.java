package MultiThreading;
class MyThread4 extends Thread{
    public void run(){
        int i=0;
        while(i<4000) {
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread5 extends Thread {
    int j = 0;
   public void run() {
        while (j < 4000) {
            System.out.println("I am sad");
            j++;
        }
    }
}
 public class P1{
    public static void main(String[] args){
        MyThread4 T1=new MyThread4();
        MyThread5 T2=new MyThread5();
        T1.start();
        T2.start();
    }
}
