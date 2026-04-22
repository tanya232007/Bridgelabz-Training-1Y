package StreamAPI;
    import java.util.Arrays;
import java.util.List;

    class Movie {
        String name;
        double rating;
        int year;

        Movie(String name, double rating, int year) {
            this.name = name;
            this.rating = rating;
            this.year = year;
        }

        @Override
        public String toString() {
            return name + " (" + year + ") - Rating: " + rating;
        }
    }

    class TrendingMovies {
        public static void main(String[] args) {
            List<Movie> movies = Arrays.asList(
                    new Movie("Movie A", 8.5, 2024),
                    new Movie("Movie B", 9.0, 2025),
                    new Movie("Movie C", 7.8, 2023),
                    new Movie("Movie D", 8.9, 2025),
                    new Movie("Movie E", 9.2, 2025),
                    new Movie("Movie F", 8.7, 2024),
                    new Movie("Movie G", 9.1, 2025)
            );

            System.out.println("Top 5 Trending Movies:");
            movies.stream()
                    .filter(m -> m.rating >= 8.0) // filter by rating
                    .sorted((m1, m2) -> {
                        int compareRating = Double.compare(m2.rating, m1.rating);
                        if (compareRating == 0) {
                            return Integer.compare(m2.year, m1.year);
                        }
                        return compareRating;
                    })
                    .limit(5)
                    .forEach(System.out::println);
        }
    }


