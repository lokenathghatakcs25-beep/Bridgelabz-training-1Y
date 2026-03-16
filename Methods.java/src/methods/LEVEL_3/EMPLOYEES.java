package methods.LEVEL_3;

public class EMPLOYEES {
        static int[][] gen(int n) {
            int[][] a = new int[n][2];

            for (int i = 0; i < n; i++) {
                a[i][0] = (int) (Math.random() * 90000) + 10000; // 5-digit salary
                a[i][1] = (int) (Math.random() * 10) + 1;        // years of service
            }
            return a;
        }
        static double[][] calc(int[][] a) {
            double[][] r = new double[a.length][2];
            for (int i = 0; i < a.length; i++) {
                double sal = a[i][0];
                int y = a[i][1];
                double b;
                if (y > 5)
                    b = sal * 0.05;
                else
                    b = sal * 0.02;
                r[i][0] = sal + b; // new salary
                r[i][1] = b;       // bonus
            }
            return r;
        }
        static void show(int[][] a, double[][] r) {
            double os = 0, ns = 0, tb = 0;
            System.out.println("OldSal   Years   Bonus   NewSal");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i][0] + "     " + a[i][1] + "     " +
                        r[i][1] + "     " + r[i][0]);
                os += a[i][0];
                ns += r[i][0];
                tb += r[i][1];
            }
            System.out.println("\nTotal Old Salary = " + os);
            System.out.println("Total New Salary = " + ns);
            System.out.println("Total Bonus = " + tb);
        }
        public static void main(String[] args) {
            int[][] a = gen(10);       // old salary & years
            double[][] r = calc(a);   // new salary & bonus
            show(a, r);
        }
    }
