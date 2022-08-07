package com.bsamuel.exercise.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static String removeDuplicates(String str) {
        return Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
    }
}
