package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JenisKendaraanTest {

    @Test
    void testMotor() {
        String input = "M\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        JenisKendaraan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Motor"));
    }

    @Test
    void testMobil() {
        String input = "C\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        JenisKendaraan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Mobil"));
    }

    @Test
    void testBus() {
        String input = "B\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        JenisKendaraan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Bus"));
    }

    @Test
    void testTruk() {
        String input = "T\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        JenisKendaraan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Truk"));
    }

    @Test
    void testUnknown() {
        String input = "X\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        JenisKendaraan.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Jenis kendaraan tidak dikenal"));
    }
}
