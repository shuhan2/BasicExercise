package com.twu.basic;


import com.twu.basic.Triganle.Triganle;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TriganleTest {
    private final ByteArrayOutputStream  outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {

        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testTriganleSingle(){
        Triganle triganle = new Triganle();
        triganle.printSingle();
        assertEquals("*", outContent.toString());
    }
    @Test
    public void testTriganleHorizontalLine(){
        Triganle triganle = new Triganle();
        triganle.printHorizontalLine(3);

        assertEquals("***", outContent.toString());
    }
    @Test
    public void testTriganleMulti(){
        Triganle triganle = new Triganle();
        triganle.printVerticalLine(3);
        assertEquals("*\r\n**\r\n***\r\n", outContent.toString());
    }

}
