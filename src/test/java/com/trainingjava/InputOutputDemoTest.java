package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InputOutputDemoTest {

    @Test
    void testMain() {
        String input = "Deden\n24\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        InputOutputDemo.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Masukkan nama anda: "));
        assertTrue(output.contains("Masukkan usia Anda: "));
        assertTrue(output.contains("Halo, Deden! Usia Anda adalah "));
    }
}
