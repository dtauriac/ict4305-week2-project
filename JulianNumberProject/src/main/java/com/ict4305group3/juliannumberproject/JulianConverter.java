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
public class JulianConverter {

    /**
     *
     * @param day
     * @param month
     * @param year
     * @return int Julian date
     */
    public static int toJulianNumber(int day, int month, int year){

        int JulianNumber = (1461 * (year + 4800 + (month - 14) / 12)) / 4
                + (367 * (month - 2 - 12 * ((month - 14) / 12))) / 12
                - (3 * ((year + 4900 + (month - 14) / 12) / 100)) 
                / 4 + day - 32075;
        return JulianNumber;       
    }

    /**
     *
     * @param JulianNumber
     * @return int[] Gregorian Date { day, month, year }
     */
    public static int[] fromJulianNumber(int JulianNumber) {

        int l = JulianNumber + 68569;
        int n = (4 * l) / 146097;
        l = l - (146097 * n + 3) / 4;
        int i = (4000 * (l + 1)) / 1461001;
        l = l - (1461 * i) / 4 + 31;
        int j = (80 * l) / 2447;
        int day = l - (2447 * j) / 80;
        l = j / 11;
        int month = j + 2 - (12 * l);
        int year = 100 * (n - 49) + i + l;

        int[] gregorian = { day, month, year };

        return gregorian;        
    }

}
