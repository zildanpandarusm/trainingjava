package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class OperatorDemoTest {

    @Test
    void testMainOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        OperatorDemo.main(new String[]{});

        String output = outContent.toString();

        assertTrue(output.contains("Jumlah: 15"));
        assertTrue(output.contains("Kurang: 5"));
        assertTrue(output.contains("Kali: 50"));
        assertTrue(output.contains("Bagi: 2"));
        assertTrue(output.contains("Sisa: 0"));
        assertTrue(output.contains("a lebih besar dari b? true"));
        assertTrue(output.contains("a sama dengan b? false"));
    }
}
