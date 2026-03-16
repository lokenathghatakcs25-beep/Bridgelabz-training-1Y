package ACCESS_MODIFIERS;
  //  Develop an Employee class with:
    //        ● employeeID (public).
      //      ● department (protected).
        //    ● salary (private).
    //Write methods to:
      //      ● Modify salary using a public method.
//● Create a subclass Manager to access employeeID and department.
  class EMPLOYEES{
      public int i;
      protected String d;
      private double s;
      public void setS(double x) {
          s = x;
      }
      public double getS() {
          return s;
      }
  }
class Manager extends main {
    void show() {
        System.out.println("ID: " + i);
        System.out.println("Dept: " + d);
        System.out.println("Salary: " + getS());
    }
}
class main{
    public static void main(String[] args) {
        Manager m = new Manager();
        main.i = 101;
        main.d = "HR";
        main.setS(50000);
        m.show();
    }
}