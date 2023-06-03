package org.patter.builder.classes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {
    @Test
    public void testReadOneWordString_ValidOnFirst() {
        // Given
        String data = "one";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        String expected = "one";
        Scanner scanner = new Scanner(System.in);

        // When
        String result = InputReader.readOneWordString(scanner);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadOneWordString_ValidOnThird() {
        // Given
        String data = "one 1" +
                "\ntwo 2" +
                "\nthree";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        String expected = "three";
        Scanner scanner = new Scanner(System.in);

        // When
        String result = InputReader.readOneWordString(scanner);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadOneWordString_Trimming() {
        // Given
        String data = "    word    ";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        String expected = "word";
        String notExpected = "    word    ";
        Scanner scanner = new Scanner(System.in);

        // When
        String result = InputReader.readOneWordString(scanner);

        // Then
        assertEquals(expected, result);
        assertNotEquals(notExpected, result);
    }

    @Test
    public void testReadStringFromList_ValidOnFirst() {
        // Given
        String data = "red";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        String expected = "red";
        List<String> values = Arrays.asList("RED", "GREEN", "BLUE");
        Scanner scanner = new Scanner(System.in);

        // When
        String result = InputReader.readStringFromList(scanner, values);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadStringFromList_ValidOnThird() {
        // Given
        String data = "read" +
                "\ngrin" +
                "\nblue";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        String expected = "blue";
        List<String> values = Arrays.asList("RED", "GREEN", "BLUE");
        Scanner scanner = new Scanner(System.in);

        // When
        String result = InputReader.readStringFromList(scanner, values);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadStringFromList_Trimming() {
        // Given
        String data = "    green\t";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        String expected = "green";
        List<String> values = Arrays.asList("RED", "GREEN", "BLUE");
        Scanner scanner = new Scanner(System.in);

        // When
        String result = InputReader.readStringFromList(scanner, values);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadStringFromList_ThrowsWhenEmptyList() {
        // Given
        String data = "red";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        List<String> values = Collections.emptyList();
        Scanner scanner = new Scanner(System.in);

        // When
        // Then
        assertThrows(InvalidParameterException.class, () -> InputReader.readStringFromList(scanner, values));
    }

    @Test
    public void testReadIntFromList_ValidOnFirst() {
        // Given
        String data = "3";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        int expected = 3;
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        Scanner scanner = new Scanner(System.in);

        // When
        int result = InputReader.readIntFromList(scanner, values);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadIntFromList_ValidOnFourth() {
        // Given
        String data = "0" +
                "\n9" +
                "\n7" +
                "\n4";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        int expected = 4;
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        Scanner scanner = new Scanner(System.in);

        // When
        int result = InputReader.readIntFromList(scanner, values);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadIntFromList_Trimming() {
        // Given
        String data = "\t2  ";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        int expected = 2;
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        Scanner scanner = new Scanner(System.in);

        // When
        int result = InputReader.readIntFromList(scanner, values);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadIntFromList_ThrowsWhenEmptyList() {
        // Given
        String data = "6";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        List<Integer> values = Collections.emptyList();
        Scanner scanner = new Scanner(System.in);

        // When
        // Then
        assertThrows(InvalidParameterException.class, () -> InputReader.readIntFromList(scanner, values));
    }

    @Test
    public void testReadBoolean_ValidOnFirst() {
        // Given
        String data = "true";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        boolean expected = true;
        Scanner scanner = new Scanner(System.in);

        // When
        boolean result = InputReader.readBoolean(scanner);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void testReadBoolean_ValidOnFourth() {
        // Given
        String data = "no" +
                "\nn" +
                "\nf" +
                "\nfalse";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        boolean expected = false;
        Scanner scanner = new Scanner(System.in);

        // When
        boolean result = InputReader.readBoolean(scanner);

        // Then
        assertEquals(expected, result);
    }
}