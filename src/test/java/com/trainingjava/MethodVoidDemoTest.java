package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MethodVoidDemoTest {

    @Test
    void testTampilkanSalam() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MethodVoidDemo demo = new MethodVoidDemo();
        demo.tampilkanSalam();

        String output = outContent.toString();
        assertTrue(output.contains("Halo, selamat datang!"));
    }

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MethodVoidDemo.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Halo, selamat datang!"));
    }
}
