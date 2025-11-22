package com.trainingjava;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SwitchCaseDemoTest {

    @Test
    void testMainOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        SwitchCaseDemo.main(new String[]{});

        String output = out.toString();

        assertTrue(output.contains("Hari ke-3 adalah Hari tidak valid"));
    }
}
