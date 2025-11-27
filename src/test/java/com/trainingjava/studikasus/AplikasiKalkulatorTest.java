package com.trainingjava.studikasus;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class AplikasiKalkulatorTest {

    @Test
    void testPenjumlahan() {
        assertEquals(7, AplikasiKalkulator.penjumlahan(3, 4));
        assertEquals(-1, AplikasiKalkulator.penjumlahan(3, -4));
        assertEquals(0, AplikasiKalkulator.penjumlahan(0, 0));
    }

    @Test
    void testPengurangan() {
        assertEquals(3, AplikasiKalkulator.pengurangan(7, 4));
        assertEquals(7, AplikasiKalkulator.pengurangan(3, -4));
        assertEquals(0, AplikasiKalkulator.pengurangan(0, 0));
    }

    @Test
    void testPerkalian() {
        assertEquals(12, AplikasiKalkulator.perkalian(3, 4));
        assertEquals(-12, AplikasiKalkulator.perkalian(3, -4));
        assertEquals(0, AplikasiKalkulator.perkalian(0, 5));
    }

    @Test
    void testPembagian() {
        assertEquals(2, AplikasiKalkulator.pembagian(8, 4));
        assertEquals(-2, AplikasiKalkulator.pembagian(8, -4));
    }

    @Test
    void testMainExitImmediately() {
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        AplikasiKalkulator.main(new String[]{});
    }

    @Test
    void testMainAddition() {
        String input = "1\n2\n3\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        AplikasiKalkulator.main(new String[]{});
    }

    @Test
    void testMainSubtraction() {
        String input = "2\n5\n3\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        AplikasiKalkulator.main(new String[]{});
    }

    @Test
    void testMainMultiplication() {
        String input = "3\n2\n3\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        AplikasiKalkulator.main(new String[]{});
    }

    @Test
    void testMainDivision() {
        String input = "4\n8\n2\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        AplikasiKalkulator.main(new String[]{});
    }
}
