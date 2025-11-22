package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CetakDeretBilanganGenapTest {

    @Test
    void testAngkaLebihDari100() {
        String input = "150\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CetakDeretBilanganGenap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Angka yang dmasukkan lebih dari 100"));
    }

    @Test
    void testAngkaKurangDari100() {
        String input = "10\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CetakDeretBilanganGenap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains(" 2"));
        assertTrue(output.contains(" 4"));
        assertTrue(output.contains(" 6"));
        assertTrue(output.contains(" 8"));
    }
}
