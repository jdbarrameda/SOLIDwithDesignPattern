import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<LibraryResource> borrowedResources;

    public Student(String name) {
        this.name = name;
        this.borrowedResources = new ArrayList<>();
    }

    public void borrow(LibraryResource resource) {
        borrowedResources.add(resource);
        System.out.println(name + " borrowed: " + resource.getTitle());
    }

    public void showBorrowedResources() {
        System.out.println(name + "'s borrowed resources:");
        for (LibraryResource resource : borrowedResources) {
            System.out.println("- " + resource.getTitle());
        }
    }
}
