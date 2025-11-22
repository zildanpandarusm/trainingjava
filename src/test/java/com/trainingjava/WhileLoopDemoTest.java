package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WhileLoopDemoTest {

    @Test
    void testWhileLoopOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        WhileLoopDemo.main(new String[]{});

        String output = out.toString();

        assertTrue(output.contains("Angka: 1"));
        assertTrue(output.contains("Angka: 2"));
        assertTrue(output.contains("Angka: 3"));
        assertTrue(output.contains("Angka: 4"));
        assertTrue(output.contains("Angka: 5"));
    }
}
