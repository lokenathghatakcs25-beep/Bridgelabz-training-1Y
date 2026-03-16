package LEVEL3;

 class Circle {
         double radius;
         Circle() {
             this(1.0); // constructor chaining
         }
         Circle(double r) {
             radius = r;
         }
         double area() {
             return 3.14 * radius * radius;
         }
         void display() {
             System.out.println("Radius: " + radius);
             System.out.println("Area: " + area());
         }
         public static void main(String[] args) {
             Circle c1 = new Circle();      // default radius
             Circle c2 = new Circle(5.0);   // user-provided radius
             c1.display();
             System.out.println();
             c2.display();
         }
     }
