package ACCESS_MODIFIERS;
    //Problem 1: University Management System
    //Create a Student class with:
      //      ● rollNumber (public).
      //      ● name (protected).
        //    ● CGPA (private).
    //Write methods to:
      //      ● Access and modify CGPA using public methods.
//● Create a subclass PostgraduateStudent to demonstrate the use of protected
  //  members.
        class Student{
            public int r;
            protected String n;
            private double g;
            public void setG(double x) {
                g = x;
            }
            public double getG() {
                return g;
            }
        }
        class PostgraduateStudent extends Student {
            void show() {
                System.out.println("Roll: " + r);
                System.out.println("Name: " + n);
                System.out.println("CGPA: " + getG());
            }
        }
        class Main{
            public static void main(String[] args) {
                PostgraduateStudent p = new PostgraduateStudent();
                p.r = 1;
                p.n = "Rahul";
                p.setG(8.5);
                p.show();
            }
        }
