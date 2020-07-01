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
public class Date {
    
    // private attributes
    private static final int[] LAST_DAYS = { 
        0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private int mJulianNumber;
    private int day;
    private int month;
    private int year;

    // constructors
    public Date() {
        this.day = 01;
        this.month = 01;
        this.year = 1970;
    };

    /**
     *
     * @param date
     */
    public Date( Date date ) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    };  

    /**
     *
     * @param day
     * @param month
     * @param year
     */
    public Date( int day, int month, int year ) {
        if(!isValidDate(day, month, year)) 
            throw new IllegalArgumentException("Invalid Date");
        this.day = day;
        this.month = month;
        this.year = year; 
    };  

    public int getDay(){
       return day;
    }; 

    public int getMonth(){
       return month;
    }; 

    public int getYear(){
       return year;
    }; 

    public static boolean isLeapYear( int year ){
        if (year % 400 == 0) {
        return true;
    } 
        else if (year % 100 == 0) {
        return false;
    } 
        else return year % 4 == 0;
    }; 

    public static int getLastDayOfMonth( int month, int year ){

    }; 

    private int toJulianNumber(int day, int month, int year){
    
    }; 

    private int[] fromJulianNumber(){
        
    };
    
    private boolean isValidDate(int day, int month, int year){
        if(day < 1 || day > LAST_DAYS[month]) return false;
        if(month < 1 || month > 31) return false;
        if(month == 2 && day == 29 && !isLeapYear(year)) return false;
        return true;
    };

}
