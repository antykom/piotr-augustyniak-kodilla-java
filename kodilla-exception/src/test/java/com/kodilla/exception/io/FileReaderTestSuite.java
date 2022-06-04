package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFile() {
        //Given
        FileReader fileReader = new FileReader();
        //When & Then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDoesntExistsReadFileShouldThrowsException() {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "Nie_ma_takiego_pliku.txt";
        //When&Then
        assertThrows(FileReaderExcepetion.class, () -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        //Given
        FileReader fileReader = new FileReader();
        //When & Then
        assertAll(
                () -> assertThrows(FileReaderExcepetion.class, () -> fileReader.readFile("niematakiegopkilu.txt")),
                () -> assertThrows(FileReaderExcepetion.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}
