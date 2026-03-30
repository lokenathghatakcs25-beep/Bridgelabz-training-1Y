package MultiThreading;
 class A extends Thread {
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println("odd nos"+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class B extends Thread{
     public void run(){
         for(int i=1;i<=10;i++){
             if(i%2==0){
                 System.out.println("Even nos"+i);
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
     }
}
 class Main{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setPriority(10);
        b.setPriority(5);
  a.start();
  b.start();
    }
}