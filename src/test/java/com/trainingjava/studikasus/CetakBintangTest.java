package com.trainingjava.studikasus;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CetakBintangTest {

    @Test
    void testMain() {
        String input = "3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CetakBintang.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("*"));
        assertTrue(output.contains("**"));
        assertTrue(output.contains("***"));
        assertTrue(output.contains("****"));
    }
}
