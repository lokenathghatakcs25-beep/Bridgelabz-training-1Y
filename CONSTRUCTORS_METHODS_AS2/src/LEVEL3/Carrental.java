package LEVEL3;
    class CarRental {
        String c;
        String m;
        int d;
        CarRental() {
            c = "Customer";
            m = "Standard";
            d = 1;
        }
        CarRental(String c1, String m1, int d1) {
            c = c1;
            m = m1;
            d = d1;
        }
        int cost() {
            int p = 1000; // price per day
            return d * p;
        }
        void display() {
            System.out.println("Customer: " + c);
            System.out.println("Car Model: " + m);
            System.out.println("Days: " + d);
            System.out.println("Total Cost: " + cost());
        }
        public static void main(String[] args) {
            CarRental r1 = new CarRental();
            CarRental r2 = new CarRental("Rahul", "SUV", 3);
            r1.display();
            System.out.println();
            r2.display();
        }
    }
