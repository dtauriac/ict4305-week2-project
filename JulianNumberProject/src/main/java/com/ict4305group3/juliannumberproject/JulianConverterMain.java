/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.juliannumberproject;

/**
 *
 * @author ICT4305 Group 3
 */
public class JulianConverterMain {
    
    public static void main(String[] args) {
       
        JulianConverter converter = new JulianConverter();
       
        int julianDate = converter.toJulianNumber(1, 2, 1957);
        
        System.out.println("The Julian date for the Gregorian date, February "
                + "1st 1957, is " + julianDate + ".");
        
        int[] gregorianDate = converter.fromJulianNumber(julianDate);
        
        System.out.println("The Gregoran date for the Julian date, 2435871, "
                + "is Day = " + gregorianDate[0] + ", Month = " 
                + gregorianDate[1] + ", and Year = " + gregorianDate[2] + ".");
       
    }   
}