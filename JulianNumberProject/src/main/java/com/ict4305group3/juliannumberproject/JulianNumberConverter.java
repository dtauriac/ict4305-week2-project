/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.juliannumberproject;

/**
 *
 * @author ipiesh
 */
public class JulianClass {

    public static int toJulianNumber(final int day, final int month, final int year){

        final int JulianNumber = (1461 * (year + 4800 + (month - 14) / 12)) / 4

                + (367 * (month - 2 - 12 * ((month - 14) / 12))) / 12

                - (3 * ((year + 4900 + (month - 14) / 12) / 100)) / 4 + day - 32075;

        return JulianNumber;

    }



    public static int[] fromJulianNumber(final int JulianNumber) {

        int l = JulianNumber + 68569;

        final int n = (4 * l) / 146097;

        l = l - (146097 * n + 3) / 4;

        final int i = (4000 * (l + 1)) / 1461001;

        l = l - (1461 * i) / 4 + 31;

        final int j = (80 * l) / 2447;

        final int day = l - (2447 * j) / 80;

        l = j / 11;

        final int month = j + 2 - (12 * l);

        final int year = 100 * (n - 49) + i + l;



        final int[] resi = new int[3];

        resi[0] = day;

        resi[1] = month;

        resi[2] = year;



        return resi;

    }



    public static void main(final String[] args) {

        

        final int[] resi = fromJulianNumber(2435871);

        System.out.println(toJulianNumber(1, 2, 1957));

        System.out.println(resi[0]);

        System.out.println(resi[1]);

        System.out.println(resi[2]);

    

    }               

    

}
