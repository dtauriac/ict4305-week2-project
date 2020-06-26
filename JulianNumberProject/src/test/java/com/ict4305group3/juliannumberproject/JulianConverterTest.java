/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.juliannumberproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//    public static void main(final String[] args) {
//
//        int[] gregorian = fromJulianNumber(1739327);
//        System.out.println(toJulianNumber(1, 2, 1957));
//        System.out.println(gregorian[1] + "/" + gregorian[0] + "/" + gregorian[2]);
//        
//    }

/**
 *
 * @author ICT4305 Group 3
 */
public class JulianConverterTest {
   
    /**
     * Test of toJulianNumber method, of class JulianConverter.
     */
    @Test
    public void testToJulianNumber() {
        
        JulianConverter myObject = new JulianConverter();
        
        int expectedResult1 = 2435871;
        int actualResult1 = myObject.toJulianNumber(1, 2, 1957);
        int expectedResult2 = 1739327;
        int actualResult2 = myObject.toJulianNumber(5, 1, 50);
        int expectedResult3 = 2266076;
        int actualResult3 = myObject.toJulianNumber(15, 3, 1492);
        int expectedResult4 = 2470166;
        int actualResult4 = myObject.toJulianNumber(25, 12, 2050);
        
        assertEquals(expectedResult1,actualResult1);
        assertEquals(expectedResult2,actualResult2);
        assertEquals(expectedResult3,actualResult3);
        assertEquals(expectedResult4,actualResult4);
    }

    /**
     * Test of fromJulianNumber method, of class JulianConverter.
     */
    @Test
    public void testFromJulianNumber() {
        //put test here
    }
    
}
