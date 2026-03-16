package methods.LEVEL_3;


   import java.util.Arrays;
    public class OTP {
        static int gen() {
            return (int)(Math.random() * 900000) + 100000;
        }
        static boolean uniq(int[] a) {

            for (int i = 0; i < a.length; i++)
                for (int j = i + 1; j < a.length; j++)
                    if (a[i] == a[j])
                        return false;
            return true;
        }
        public static void main(String[] args) {
            int[] a = new int[10];
            for (int i = 0; i < 10; i++)
                a[i] = gen();
            System.out.println("Generated OTPs:");
            for (int x : a)
                System.out.println(x);
            if (uniq(a))
                System.out.println("All OTPs are unique");
            else
                System.out.println("Some OTPs are same");
        }
    }
