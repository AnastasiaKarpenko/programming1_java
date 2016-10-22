
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anastasia
 */
public class Library {

    private ArrayList<Book> collection;

    public Library() {
        this.collection = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        collection.add(newBook);
    }

    public void printBooks() {
        for (Book book : collection) {
            System.out.println(book);

        }

    }

}
