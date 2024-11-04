package Challenge14.problem1;

public class LibraryItems {

    private String itemId;
    private String title;
    private String author;

    public void Checkout() {
        System.out.println("Checkout successful for item: " + itemId);
    }

    public void ReturnItem() {
        System.out.println("Return successful for item: " + itemId);
    }
}
