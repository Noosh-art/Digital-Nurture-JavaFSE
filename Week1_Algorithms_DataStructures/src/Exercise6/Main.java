package Exercise6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Book[] books={

                new Book(1,"Java","James"),
                new Book(2,"Python","Guido"),
                new Book(3,"C","Dennis")

        };

        Book b=Library.linearSearch(books,"Python");

        if(b!=null)
            System.out.println(b.title);

        Arrays.sort(books, Comparator.comparing(book->book.title));

        Book b2=Library.binarySearch(books,"Python");

        if(b2!=null)
            System.out.println(b2.title);

    }

}