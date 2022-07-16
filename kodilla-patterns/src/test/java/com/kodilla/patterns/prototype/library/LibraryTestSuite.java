package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("National Library");
        Book book1 = new Book("W pustyni i w puszczy", "H.Sienkiewicz", LocalDate.of(1911, 1, 30));
        Book book2 = new Book("Mechnika budowli", "Z. Dylag", LocalDate.of(1993, 10, 11));
        Book book3 = new Book("Wyrok", "R.Mroz", LocalDate.of(2020, 11, 01));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("City Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Communal Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        library.getBooks().remove(book2);


        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
