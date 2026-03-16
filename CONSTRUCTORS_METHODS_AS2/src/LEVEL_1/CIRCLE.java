package LEVEL_1;

public class CIRCLE {
        double r;
        CIRCLE(double r) {
            this.r = r;
        }
        double area() {
            return Math.PI * r * r;
        }
        double circ() {
            return 2 * Math.PI * r;
        }
        void show() {
            System.out.println("Radius = " + r);
            System.out.println("Area = " + area());
            System.out.println("Circumference = " + circ());
        }
        public static void main(String[] args) {
            CIRCLE c = new CIRCLE(5);   // radius = 5
        }
    }
