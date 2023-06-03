package org.patter.builder.classes;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputReader {

    public static String readOneWordString(Scanner sc) {
        String answer = sc.nextLine();
        while (answer.trim().contains(" ")) {
            System.out.println("Input should be one word string, try again:");
            answer = sc.nextLine();
        }
        return answer.trim();
    }

    public static String readStringFromList(Scanner sc, List<String> values) {
        if (values == null || values.isEmpty())
            throw new InvalidParameterException("List of values should not be null or empty");

        values = values.stream().map(String::toUpperCase).collect(Collectors.toList());

        String answer = readOneWordString(sc);
        while (!values.contains(answer.toUpperCase())) {
            System.out.println("Given value should be one from list " + String.join("/", values) + ": ");
            answer = readOneWordString(sc);
        }
        return answer;
    }

    public static int readIntFromList(Scanner sc, List<Integer> values) {
        return Integer.parseInt(readStringFromList(sc, values.stream().map(String::valueOf).collect(Collectors.toList())));
    }

    public static boolean readBoolean(Scanner sc) {
        List<String> values = List.of("true", "false");
        return Boolean.parseBoolean(readStringFromList(sc, values));
    }
}
