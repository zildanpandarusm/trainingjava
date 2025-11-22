package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CekBilanganTest {

    @Test
    void testBilanganPositif() {
        ByteArrayInputStream in = new ByteArrayInputStream("5\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CekBilangan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Bilangan positif"));
    }

    @Test
    void testBilanganNol() {
        ByteArrayInputStream in = new ByteArrayInputStream("0\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CekBilangan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Bilangan nol"));
    }

    @Test
    void testBilanganNegatif() {
        ByteArrayInputStream in = new ByteArrayInputStream("-3\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CekBilangan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Bilangan negatif"));
    }
}
