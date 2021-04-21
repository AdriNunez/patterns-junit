package com.patterns.behavioral.iterator.iterator2;


import java.util.Iterator;

import com.patterns.behavioral.iterator.iterator1.Book;
import com.patterns.solid.ElectricCar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(ElectricCar.class);
        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );

        BookShop books = new BookShop();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);


        Iterator<Book> iterador = books.iterator();
        while (iterador.hasNext()){
            Book book = iterador.next();
            log.info("",book);
        }
        log.info("==========");

        for (Book book: books) {
           log.info("",book);
        }
    }
}
