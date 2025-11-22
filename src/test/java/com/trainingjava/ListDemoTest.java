package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ListDemoTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ListDemo.main(new String[]{});

        String output = outContent.toString();

        assertTrue(output.contains("Nama ke-1: Andi"));
        assertTrue(output.contains("Nama ke-2: Budi"));
        assertTrue(output.contains("Nama ke-3: Citra"));
    }
}
