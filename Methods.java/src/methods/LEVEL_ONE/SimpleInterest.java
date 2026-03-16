package methods.LEVEL_ONE;

public class SimpleInterest {

    public static void SimpleInterst(double p, double r, double t)
    {
        double SI = (p * r * t) / 100;
        System.out.println("simple interest " + SI);
    }

    public static void main(String[] args)
    {
        SimpleInterst(2000, 5, 2);
    }
}

