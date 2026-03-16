package methods.LEVEL_TWO;

class RandomNums {
    public static int[] gen(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 9000) + 1000;
        }
        return a;
    }
    public static double[] calc(int[] a) {

        int min = a[0];
        int max = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        double avg = (double) sum / a.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] a = gen(5);
        System.out.println("Random Numbers:");
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
        double[] r = calc(a);
        System.out.println("Average = " + r[0]);
        System.out.println("Min = " + (int) r[1]);
        System.out.println("Max = " + (int) r[2]);
    }
}
