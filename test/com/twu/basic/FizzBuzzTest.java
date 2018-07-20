package com.twu.basic;

import com.twu.basic.FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzzSingleNumber(15);
        assertEquals("FizzBuzz\r\n",outContent.toString());
    }
    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzzSingleNumber(3);
        assertEquals("Fizz\r\n",outContent.toString());
    }
    public void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzzSingleNumber(10);
        assertEquals("Buzz\r\n",outContent.toString());
    }
    public void testnormalNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzzSingleNumber(1);
        assertEquals("1\r\n",outContent.toString());
    }
}
