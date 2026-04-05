public class Thesis implements LibraryResource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing the thesis: " + title);
    }
}