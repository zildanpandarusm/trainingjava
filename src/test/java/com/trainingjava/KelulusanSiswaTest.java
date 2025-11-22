package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KelulusanSiswaTest {

    @Test
    void testLulus() {
        String input = "75\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KelulusanSiswa.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Lulus"));
    }

    @Test
    void testTidakLulus() {
        String input = "60\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KelulusanSiswa.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tidak Lulus"));
    }
}
