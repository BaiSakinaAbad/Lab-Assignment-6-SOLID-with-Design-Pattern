public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Create different resources
        LibraryResource book = new Book();
        LibraryResource journal = new Journal();
        LibraryResource thesis = new Thesis();

        System.out.println("--- NEU Library System ---");
        student.borrowResource(book, "Metamorphosis");
        student.borrowResource(journal, "IEEE Software Engineering Journal");
        student.borrowResource(thesis, "Impact of AI on Modern Libraries");

        // Example of how easy it is to add a new type
        LibraryResource audioBook = (title) -> System.out.println("Streaming audio book: " + title);
        student.borrowResource(audioBook, "The Broken Soul of me");
    }
}