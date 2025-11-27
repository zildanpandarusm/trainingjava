package com.trainingjava.studikasus;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KonversiSuhuTest {

    @Test
    void testCelciusKeFahrenheit() {
        assertEquals(32.0, KonversiSuhu.celciusKeFahrenheit(0), 0.01);
        assertEquals(212.0, KonversiSuhu.celciusKeFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitKeCelcius() {
        assertEquals(0.0, KonversiSuhu.fahrenheitKeCelcius(32), 0.01);
        assertEquals(100.0, KonversiSuhu.fahrenheitKeCelcius(212), 0.01);
    }

    @Test
    void testCelciusKeKelvin() {
        assertEquals(273.15, KonversiSuhu.celciusKeKelvin(0), 0.01);
        assertEquals(373.15, KonversiSuhu.celciusKeKelvin(100), 0.01);
    }

    @Test
    void testKelvinKeCelcius() {
        assertEquals(0.0, KonversiSuhu.kelvinKeCelcius(273.15), 0.01);
        assertEquals(100.0, KonversiSuhu.kelvinKeCelcius(373.15), 0.01);
    }

    @Test
    void testMainKeluarLangsung() {
        String input = "5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Terima kasih telah menggunakan program Konversi Suhu!"));
    }

    @Test
    void testMainCelciusKeFahrenheit() {
        String input = "1\n0\ny\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Hasil Konversi: 0.00 °C = 32.00 °F"));
    }

    @Test
    void testMainFahrenheitKeCelcius() {
        String input = "2\n32\nn\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Hasil Konversi: 32.00 °F = 0.00 °C"));
    }

    @Test
    void testMainCelciusKeKelvin() {
        String input = "3\n0\nn\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Hasil Konversi: 0.00 °C = 273.15 K"));
    }

    @Test
    void testMainKelvinKeCelcius() {
        String input = "4\n273.15\nn\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Hasil Konversi: 273.15 K = 0.00 °C"));
    }

    @Test
    void testMainInputInvalidPilihan() {
        String input = "X\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Input tidak valid. Harap masukkan angka."));
    }

    @Test
    void testMainInputInvalidSuhu() {
        String input = "1\nX\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Input suhu tidak valid. Harap masukkan angka."));
    }

    @Test
    void testMainPilihanTidakValid() {
        String input = "6\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        KonversiSuhu.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Pilihan yang Anda masukkan tidak tersedia. Harap pilih 1-5."));
    }
}
