package com.twu.basic;


import com.twu.basic.DiamondwithName.DiamondWithName;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DiamondWithNameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testDimondWithName(){
        DiamondWithName diamondWithName = new DiamondWithName();
        diamondWithName.diamondWithName(3,"Bill");
        assertEquals("  *  \r\n *** \r\nBill\r\n", outContent.toString());
    }

}
