package BasicOfJava.triangle;
import java.util.Scanner;
class Library{
    int bookid;
    String title;
    String author;
    boolean isAvailable;
    Library(int bookid, String title, String author){
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    void show(){
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Books: " + isAvailable);
    }
    void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("madarchod boi nia ja issue hoisa");
        } else {
            System.out.println("oi bokachoda boi nai");
        }
    }
    void returnBook() {
        isAvailable = true;
        System.out.println("ja khanki tor boi return succesful hoisa");
    }


}

public class librarybook {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        Library book1 = new Library(112,"java program","abir");
        Library book2 = new Library(123,"structure program","rafi");
        book1.show();
        book2.show();
        System.out.println("issue kortasi book1");
        book1.issueBook();
        System.out.println("issue kortasi book2");
        book2.issueBook();
        System.out.println("return kortasi book1");
        book1.returnBook();
        System.out.println("return kori nai tau daktasi information asa naki");
        book2.show();


    }
}
