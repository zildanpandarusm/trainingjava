package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LuasPersegiPanjangTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LuasPersegiPanjang.main(new String[]{});

        String output = outContent.toString();

        assertTrue(output.contains("Luas persegi panjang: 50"));
    }
}
