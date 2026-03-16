package LEVEL3;

public class HotelBooking {
        String g;
        String r;
        int n;
        HotelBooking() {
            g = "Guest";
            r = "Standard";
            n = 1;
        }
        HotelBooking(String g1, String r1, int n1) {
            g = g1;
            r = r1;
            n = n1;
        }
        HotelBooking(HotelBooking h) {
            g = h.g;
            r = h.r;
            n = h.n;
        }
        void display() {
            System.out.println("Guest: " + g);
            System.out.println("Room: " + r);
            System.out.println("Nights: " + n);
        }
        public static void main(String[] args) {
            HotelBooking b1 = new HotelBooking();
            HotelBooking b2 = new HotelBooking("Rahul", "Deluxe", 3);
            HotelBooking b3 = new HotelBooking(b2);
            b1.display();
            System.out.println();
            b2.display();
            System.out.println();
            b3.display();
        }
    }