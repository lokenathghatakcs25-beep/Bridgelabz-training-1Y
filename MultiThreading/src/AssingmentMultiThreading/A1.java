package AssingmentMultiThreading;
    class Bank implements Runnable{
        String n;
        String t;
        Bank(String n, String t) {
            this.n = n;
            this.t = t;
        }
        public void run() {
            Thread th = Thread.currentThread();
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                        "Name: " + n + " | Type: " + t + " | Priority: " + th.getPriority() + " | Check: " + i);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }
        }
    }
   public class A1{
        public static void main(String[] args) {
            Bank b1 = new Bank("Lokenath", "Premium");
            Bank b2 = new Bank("Rahul", "Regular");
            Bank b3 = new Bank("Amit", "Basic");
            Thread t1 = new Thread(b1);
            Thread t2 = new Thread(b2);
            Thread t3 = new Thread(b3);
            t1.setPriority(10);
            t2.setPriority(5);
            t3.setPriority(1);
            t1.start();
            t2.start();
            t3.start();
        }
    }

