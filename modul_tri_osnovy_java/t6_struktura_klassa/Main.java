public class Main {
    static void main(String[] args) {
        Author author1 = new Author("Иван Анатольевич", "Романов", 4);

        Book book1 = new Book("Живые и мёртвые", 1934, author1, 100);

        System.out.println(book1.isBig());
        System.out.println(book1.matches("Анатольевич"));
        System.out.println(book1.estimatePrice());
    }
}
