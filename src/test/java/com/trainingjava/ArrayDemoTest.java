package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayDemoTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        ArrayDemo.main(new String[]{});

        System.setOut(originalOut);
        String output = outContent.toString();

        assertTrue(output.contains("Indeks 0: 10"));
        assertTrue(output.contains("Indeks 1: 20"));
        assertTrue(output.contains("Indeks 2: 30"));
        assertTrue(output.contains("Indeks 3: 40"));
        assertTrue(output.contains("Indeks 4: 50"));
    }
}
