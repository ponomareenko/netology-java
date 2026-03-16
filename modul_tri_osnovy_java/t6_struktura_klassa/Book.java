public class Book {
    String title;
    int releaseYear;
    int pages;

    public Author author;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (title.contains(word) || author.name.contains(word) || author.surname.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = 3 * pages * (int) Math.floor(Math.sqrt(author.rating));

        if (price < 250) {
            return 250;
        } else {
            return price;
        }
    }
}
