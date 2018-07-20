package com.twu.basic;

import com.twu.basic.PrimeFactor.PrimeFactor;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PrimeFactorTest {

    @Test
    public void testPrimeFactorNormalNumber(){
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> expextAnswer1 = new ArrayList<Integer>();
        expextAnswer1.add(2);
        expextAnswer1.add(3);
        expextAnswer1.add(5);
        assertEquals(primeFactor.generate(30),expextAnswer1);
        List<Integer> expextAnswer2 = new ArrayList<Integer>();
        expextAnswer1.add(3);
        expextAnswer1.add(19);
        assertEquals(primeFactor.generate(57),expextAnswer1);

    }
    @Test
    public void testPrimeFactorSpecialNumber(){
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> expextAnswer = new ArrayList<Integer>();
        assertEquals(primeFactor.generate(1),expextAnswer);
    }

}
