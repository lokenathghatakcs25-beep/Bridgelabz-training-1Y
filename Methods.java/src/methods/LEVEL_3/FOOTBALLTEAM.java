package methods.LEVEL_3;

import java.util.Random;

    public class FOOTBALLTEAM {
        public static int sum(int[] h) {
            int s = 0;
            for (int i = 0; i < h.length; i++) {
                s += h[i];
            }
            return s;
        }
        public static double mean(int[] h) {
            return (double)sum(h) / h.length;
        }
        public static int shortest(int[] h) {
            int min = h[0];
            for (int i = 1; i < h.length; i++) {
                if (h[i] < min) min = h[i];
            }
            return min;
        }
        public static int tallest(int[] h) {
            int max = h[0];
            for (int i = 1; i < h.length; i++) {
                if (h[i] > max) max = h[i];
            }
            return max;
        }
        public static void main(String[] args) {
            int[] heights = new int[11];
            Random r = new Random();
            for (int i = 0; i < heights.length; i++) {
                heights[i] = 150 + r.nextInt(101); // 0–100 + 150 → 150–250
            }
            System.out.print("Heights of players: ");
            for (int h : heights) System.out.print(h + " ");
            System.out.println();
            System.out.println("Shortest height: " + shortest(heights));
            System.out.println("Tallest height: " + tallest(heights));
            System.out.println("Mean height: " + mean(heights));
        }
    }
