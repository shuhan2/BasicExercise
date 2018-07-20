package com.twu.basic;

import com.twu.basic.Diamond.Diamond;
import com.twu.basic.Triganle.Triganle;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DimondTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testDimaondIsosceles(){
        Diamond dimond = new Diamond();
        dimond.dimondIsosceles(3);
        assertEquals("  *  \r\n *** \r\n*****\r\n", outContent.toString());
    }
    @Test
    public void testDimaondCentered(){
        Diamond dimond = new Diamond();
//       System.out.print("  *  \r\n *** \r\n*****\r\n *** \r\n  *  \r\n");

        dimond.dimondCentered(3);
        assertEquals("  *  \r\n *** \r\n*****\r\n *** \r\n  *  \r\n", outContent.toString());
    }
}
