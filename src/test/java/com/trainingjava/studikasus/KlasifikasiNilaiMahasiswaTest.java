package com.trainingjava.studikasus;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KlasifikasiNilaiMahasiswaTest {

    @Test
    void testHitungRataRata() {
        Double[] nilai1 = {80.0, 90.0, 70.0};
        assertEquals(80.0, KlasifikasiNilaiMahasiswa.hitungRataRata(nilai1));

        Double[] nilai2 = {60.0, 50.0, 55.0};
        assertEquals(55.0, KlasifikasiNilaiMahasiswa.hitungRataRata(nilai2));

        Double[] nilai3 = {40.0, 30.0, 50.0};
        assertEquals(40.0, KlasifikasiNilaiMahasiswa.hitungRataRata(nilai3));
    }

    @Test
    void testMainLulus() {
        String input = "3\n80\n90\n70\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KlasifikasiNilaiMahasiswa.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Rata-rata nilai Anda adalah 80.0"));
        assertTrue(output.contains("Lulus"));
    }

    @Test
    void testMainRemedial() {
        String input = "3\n60\n50\n55\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KlasifikasiNilaiMahasiswa.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Rata-rata nilai Anda adalah 55.0"));
        assertTrue(output.contains("Remedial"));
    }

    @Test
    void testMainTidakLulus() {
        String input = "3\n40\n30\n50\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KlasifikasiNilaiMahasiswa.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Rata-rata nilai Anda adalah 40.0"));
        assertTrue(output.contains("Tidak lulus"));
    }
}
