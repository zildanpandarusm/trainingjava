package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DoWhileDemoTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        DoWhileDemo.main(new String[]{});

        System.setOut(originalOut);
        String output = outContent.toString();
        assertTrue(output.contains("Angka: 1"));
        assertTrue(output.contains("Angka: 2"));
        assertTrue(output.contains("Angka: 3"));
        assertTrue(output.contains("Angka: 4"));
        assertTrue(output.contains("Angka: 5"));
    }
}
