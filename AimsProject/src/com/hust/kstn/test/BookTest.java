package com.hust.kstn.test;

import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.Book;
import java.util.ArrayList;
import java.util.List;

public class BookTest {

    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Le Quang Thuy", 1970, "PhD");
        BookAuthor author2 = new BookAuthor("Nguyen Thi Bach Kim", 1961, "Associate Professor");
        List<BookAuthor> authors = new ArrayList<>();

        authors.add(author1);
        authors.add(author2);
        Book book = new Book("Nhap mon cac phuong phap toi uu", "MI3052", 8, 200, authors);
        System.out.println(book.toString());
    }
}
