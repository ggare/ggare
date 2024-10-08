class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[" + "name=" + name + ", email=" + email + ", gender=" + gender + ']';
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;
    Book(String name, Author author, int price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ' ' + author + ", price=" + price + ", quantity=" + quantity + ']';
    }
}

class Library1 {
    private Book[] books;
    private int count;
    public Library1(int numBooks) {
        books = new Book[numBooks];
        count = 0;
    }
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library Full");
        }
    }
    public void updateBook(String nameBook, double price, int quantity) {
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equals(nameBook)) {
                if (price != 0) {
                    books[i].setPrice(price);
                }
                if (quantity != 0) {
                    books[i].setQuantity(quantity);
                }
                System.out.println("Book " + nameBook + " updated");
                return;
            }
        }
        System.out.println("Book " + nameBook + " not found");
    }
    public void displayBook() {
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        } else {
            System.out.println("Library is empty");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("John", "john@gmail.com", 'M');
        Author author2 = new Author("Jane", "jane@gmail.com", 'F');
        Book book1 = new Book("Book 1", author1, 100, 10);
        Book book2 = new Book("Book 2", author2, 203, 16);
        Library1 library1 = new Library1(10);
        library1.addBook(book1);
        library1.addBook(book2);
        System.out.println("Books in a library:");
        library1.displayBook();
        library1.updateBook("Book 2", 20.52, 130);
        System.out.println("After updating: ");
        library1.displayBook();
    }
}
