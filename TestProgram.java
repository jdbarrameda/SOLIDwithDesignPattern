public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Jhoana Barrameda");

        LibraryResource book = new Book("Introduction to Software Engineering");
        LibraryResource journal = new Journal("CICS Computer Magazine");

        student.borrow(book);
        student.borrow(journal);

        student.showBorrowedResources();
    }
}
