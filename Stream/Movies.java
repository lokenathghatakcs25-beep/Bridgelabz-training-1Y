package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Movie {
    private String title;
    private String genre;
    private double rating;
    private int releaseYear;
    private int votes;

    public Movie(String title, String genre, double rating, int releaseYear, int votes) {
        this.title       = title;
        this.genre       = genre;
        this.rating      = rating;
        this.releaseYear = releaseYear;
        this.votes       = votes;
    }

    public String getTitle()       { return title; }
    public String getGenre()       { return genre; }
    public double getRating()      { return rating; }
    public int    getReleaseYear() { return releaseYear; }
    public int    getVotes()       { return votes; }

    public void printCard(int rank) {
        System.out.printf("  #%d  %-35s | %d | %-15s | ⭐ %.1f | 👥 %,d votes%n",
                rank, title, releaseYear, genre, rating, votes);
    }
}
public class Movies {
    static void printHeader(String title) {
        System.out.println("\n╔══════════════════════════════════════════════════════════════════════╗");
        System.out.printf ("║  🎬 %-66s║%n", title);
        System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
    }

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Oppenheimer",                   "Drama",      8.4, 2023, 980000),
                new Movie("The Shawshank Redemption",      "Drama",      9.3, 1994, 2800000),
                new Movie("Dune: Part Two",                "Sci-Fi",     8.6, 2024, 620000),
                new Movie("Poor Things",                   "Comedy",     7.9, 2023, 310000),
                new Movie("Killers of the Flower Moon",    "Crime",      7.7, 2023, 290000),
                new Movie("The Dark Knight",               "Action",     9.0, 2008, 2700000),
                new Movie("Interstellar",                  "Sci-Fi",     8.7, 2014, 2100000),
                new Movie("Past Lives",                    "Romance",    7.9, 2023, 180000),
                new Movie("Saltburn",                      "Thriller",   7.4, 2023, 260000),
                new Movie("Parasite",                      "Thriller",   8.5, 2019, 870000),
                new Movie("The Zone of Interest",          "Drama",      7.4, 2023, 140000),
                new Movie("Asteroid City",                 "Comedy",     6.6, 2023, 120000),
                new Movie("Mission: Impossible Dead Reckoning", "Action",7.7, 2023, 330000),
                new Movie("Spider-Man: Across the Spider-Verse","Animation",8.6,2023,570000),
                new Movie("Barbie",                        "Comedy",     6.9, 2023, 520000),
                new Movie("Anatomy of a Fall",             "Drama",      7.8, 2023, 160000),
                new Movie("The Holdovers",                 "Drama",      8.0, 2023, 210000),
                new Movie("Maestro",                       "Biography",  6.6, 2023, 110000),
                new Movie("American Fiction",              "Comedy",     7.8, 2023, 150000),
                new Movie("Civil War",                     "Action",     7.3, 2024, 200000)
        );

        printHeader("Top 5 — Recent (2020+) High-Rated Movies");
        List<Movie> recentTop5 = movies.stream()
                .filter(m -> m.getReleaseYear() >= 2020)
                .filter(m -> m.getRating() >= 7.5)
                .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))
                .limit(5)
                .collect(Collectors.toList());

        int rank = 1;
        for (Movie m : recentTop5) m.printCard(rank++);

        printHeader("Top 5 — All-Time by Rating (Any Year)");
        List<Movie> allTimeTop5 = movies.stream()
                .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))
                .limit(5)
                .collect(Collectors.toList());

        rank = 1;
        for (Movie m : allTimeTop5) m.printCard(rank++);

        printHeader("Top 5 — Most Voted (Popularity Trending)");
        List<Movie> mostVoted = movies.stream()
                .sorted((m1, m2) -> Integer.compare(m2.getVotes(), m1.getVotes()))
                .limit(5)
                .collect(Collectors.toList());

        rank = 1;
        for (Movie m : mostVoted) m.printCard(rank++);

        printHeader("Top 5 — Sci-Fi & Action Genre Only");
        List<Movie> genreTop5 = movies.stream()
                .filter(m -> m.getGenre().equals("Sci-Fi") || m.getGenre().equals("Action"))
                .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))
                .limit(5)
                .collect(Collectors.toList());

        rank = 1;
        for (Movie m : genreTop5) m.printCard(rank++);

        printHeader("Top 5 — Best Rating + Year Combined Score");
        List<Movie> compositeTop5 = movies.stream()
                .filter(m -> m.getRating() >= 7.0)
                .sorted((m1, m2) -> {
                    double score1 = m1.getRating() * 0.7 + (m1.getReleaseYear() - 1990) * 0.03;
                    double score2 = m2.getRating() * 0.7 + (m2.getReleaseYear() - 1990) * 0.03;
                    return Double.compare(score2, score1);
                })
                .limit(5)
                .collect(Collectors.toList());

        rank = 1;
        for (Movie m : compositeTop5) m.printCard(rank++);
    }
}