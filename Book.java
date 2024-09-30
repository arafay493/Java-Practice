class Book {
    static int totalBooks;
    String isbn;
    String title;
    String author;
    boolean isBorrowed;


    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this("Unknown" , "Unknown" , isbn);
    }

    // Book(String isbn){
    //     title = "Mathematics";
    //     author = "James";
    //     this.isbn = isbn;
    // }
    
    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book already borrowed");
        }else{
            isBorrowed = true;
            totalBooks--;
            System.out.println("Book borrowed successfully.");
        }
        // if(totalBooks > 0){
        //     totalBooks--;
        //     System.out.println("Book borrowed successfully.");
        // } else {
        //     System.out.println("No books available to borrow.");
        // }
    }

    void returnBook(){
        if(!isBorrowed){
            System.out.println("Book is not borrowed");
        } else{
            System.out.println("Book returned successfully.");
            isBorrowed = false;
            // totalBooks++;
        }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "Design" , "Author");
        Book book1 = new Book("12345");
        // System.out.println(book.title);
        // System.out.println(book.getTotalBooks());
        book.borrowBook();
        book1.borrowBook();
        book.borrowBook();
        book.returnBook();
        book.returnBook();
    }
}
