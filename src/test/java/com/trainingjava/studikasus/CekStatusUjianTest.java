package com.trainingjava.studikasus;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CekStatusUjianTest {

    @Test
    void testLulusRemedialTidakLulus() {
        String input = "80\n65\n40\n-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CekStatusUjian.inputNilai();

        String output = outContent.toString();
        assertTrue(output.contains("Selamat Anda lulus"));
        assertTrue(output.contains("Anda harus remedial"));
        assertTrue(output.contains("Anda tidak lulus"));
    }

    @Test
    void testMain() {
        String input = "-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CekStatusUjian.main(new String[]{});
    }
}
