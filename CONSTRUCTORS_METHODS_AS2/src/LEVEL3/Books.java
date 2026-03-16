package LEVEL3;

 class Book {
        String title;
        String author;
        double price;
        Book() {
            title = "Unknown";
            author = "Unknown";
            price = 0.0;
        }
        Book(String t, String a, double p) {
            title = t;
            author = a;
            price = p;
        }
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
        public static void main(String[] args) {
            Book b1 = new Book();
            b1.display();
            System.out.println();
            Book b2 = new Book("Java Programming", "James Gosling", 450.50);
            b2.display();
        }
    }
