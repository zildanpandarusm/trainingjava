package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HitungMundurTest {

    @Test
    void testMain() {
        String input = "3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        HitungMundur.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("3"));
        assertTrue(output.contains("2"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("0"));
    }
}
