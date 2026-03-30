package AssingmentMultiThreading;
class Order implements Runnable {
    int id;
    String r;
    int t;
    Order(int id, String r, int t) {
        this.id = id;
        this.r = r;
        this.t = t;
    }
    public void run() {
        Thread th = Thread.currentThread();
        long s = System.currentTimeMillis();
        try {
            System.out.println("Order " + id + " picked by " + th.getName());
            Thread.sleep(1000);
            System.out.println("Order " + id + " in transit");
            Thread.sleep(t * 1000);
            System.out.println("Order " + id + " delivered");

            long e = System.currentTimeMillis();

            System.out.println("Time: " + (e - s) / 1000 + " sec\n");

        } catch (Exception e1) {
            System.out.println("Error");
        }
    }
}
 public class A3{
    public static void main(String[] args) {

        Order o1 = new Order(1, "KFC", 3);
        Order o2 = new Order(2, "Dominos", 4);
        Order o3 = new Order(3, "BurgerKing", 2);
        Order o4 = new Order(4, "PizzaHut", 5);
        Order o5 = new Order(5, "Subway", 3);
        Thread t1 = new Thread(o1, "A1");
        Thread t2 = new Thread(o2, "A2");
        Thread t3 = new Thread(o3, "A3");
        Thread t4 = new Thread(o4, "A4");
        Thread t5 = new Thread(o5, "A5");
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(10);
        t5.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}