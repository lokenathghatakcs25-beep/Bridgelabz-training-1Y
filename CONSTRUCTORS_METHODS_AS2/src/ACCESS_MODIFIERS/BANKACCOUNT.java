package ACCESS_MODIFIERS;
// BANKACCOUNT
 class BANKACCOUNT{
    public int a;
    protected String h;
    private double b;
    public void setB(double x) {
        b = x;
    }
    public double getB() {
        return b;
    }
}
class SavingsAccount extends BANKACCOUNT{
    void show() {
        System.out.println("Account No: " + a);
        System.out.println("Holder: " + h);
        System.out.println("Balance: " + getB());
    }
}
class main{
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.a = 12345;
        s.h = "Rahul";
        s.setB(5000);
        s.show();
    }
}

