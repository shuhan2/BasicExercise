package com.twu.basic;

import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DimondTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
}
