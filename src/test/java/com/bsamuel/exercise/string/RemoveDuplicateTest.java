package com.bsamuel.exercise.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {

    @Test
    void removeDuplicates() {
        String str = "Duplicate String for Deleting....";
        String returnStr = RemoveDuplicate.removeDuplicates(str);
        assertEquals("Duplicate Srngfo.", returnStr);

    }
}