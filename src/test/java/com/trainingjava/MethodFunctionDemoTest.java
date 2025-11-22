package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MethodFunctionDemoTest {

    @Test
    void testHitungLuas() {
        MethodFunctionDemo demo = new MethodFunctionDemo();
        int hasil = demo.hitungLuas(4);
        assertEquals(16, hasil);
    }

    @Test
    void testMainOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MethodFunctionDemo.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Luas persegi: 25"));
    }
}
