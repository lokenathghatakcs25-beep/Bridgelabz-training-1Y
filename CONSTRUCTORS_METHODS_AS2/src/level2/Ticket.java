package level2;
    import java.util.Scanner;
    class MovieTicket {
        String m;      // movie name
        int seat;      // seat number
        double p;      // price
        public MovieTicket(String movie) {
            m = movie;
            seat = 0;  // 0 means not booked
            p = 0.0;
        }
        public void book(int s, double price) {
            seat = s;
            p = price;
            System.out.println("Ticket booked for seat " + seat);
        }
        public void disp() {
            if (seat == 0) {
                System.out.println("Ticket not booked yet.");
            } else {
                System.out.println("Movie: " + m);
                System.out.println("Seat: " + seat);
                System.out.println("Price: " + p);
            }
        }
    }
    public class Ticket {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter movie name: ");
            String movie = sc.nextLine();
            MovieTicket t = new MovieTicket(movie);
            System.out.println("\n--- Booking Ticket ---");
            System.out.print("Enter seat number: ");
            int s = sc.nextInt();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            t.book(s, price);
            System.out.println("\n--- Ticket Details ---");
            t.disp();
            sc.close();
        }
    }

