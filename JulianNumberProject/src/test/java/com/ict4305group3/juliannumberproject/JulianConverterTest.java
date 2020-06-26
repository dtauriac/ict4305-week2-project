/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.juliannumberproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 *
 * @author ICT4305 Group 3
 */
public class JulianConverterTest {
   
    /**
     * Test of toJulianNumber method, of class JulianConverter. 
     * This is a happy test of four separate Gregorian dates that 
     * should return the expected Julian dates.
     */
    @Test
    public void testToJulianNumber() {
   
        int expectedResult1 = 2435871;
        int actualResult1 = JulianConverter.toJulianNumber(1, 2, 1957);
        
        int expectedResult2 = 1739327;
        int actualResult2 = JulianConverter.toJulianNumber(5, 1, 50);
        
        int expectedResult3 = 2266076;
        int actualResult3 = JulianConverter.toJulianNumber(15, 3, 1492);
        
        int expectedResult4 = 2470166;
        int actualResult4 = JulianConverter.toJulianNumber(25, 12, 2050);
        
        assertEquals(expectedResult1,actualResult1);
        assertEquals(expectedResult2,actualResult2);
        assertEquals(expectedResult3,actualResult3);
        assertEquals(expectedResult4,actualResult4);
        
    }

    /**
     * Test of fromJulianNumber method, of class JulianConverter.
     * This is a happy test of four separate Julian dates that return an int[]
     * of the Gregorian dates [ day, month, year ].
     */
    @Test
    public void testFromJulianNumber() {
        
        int[] expectedResult1 = { 1, 2, 1957 };
        int[] actualResult1 = JulianConverter.fromJulianNumber(2435871);
        
        int[] expectedResult2 = { 5, 1, 50 };
        int[] actualResult2 = JulianConverter.fromJulianNumber(1739327);
        
        int[] expectedResult3 = { 15, 3, 1492 };
        int[] actualResult3 = JulianConverter.fromJulianNumber(2266076);
        
        int[] expectedResult4 = { 25, 12, 2050 };
        int[] actualResult4 = JulianConverter.fromJulianNumber(2470166);
        
        assertArrayEquals(expectedResult1,actualResult1);
        assertArrayEquals(expectedResult2,actualResult2);
        assertArrayEquals(expectedResult3,actualResult3);
        assertArrayEquals(expectedResult4,actualResult4);

    }
    
}
