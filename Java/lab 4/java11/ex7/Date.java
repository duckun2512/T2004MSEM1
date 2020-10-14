package ex7;

import java.time.format.DateTimeFormatter;

public class Date {
    private int day;
    private int month;
    private int year;

    // Constructs a Date instance with the given year, month and day. No input validation
    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    // Returns the day
    public int getDay() {
        return day;
    }

    // Returns the month
    public int getMonth() {
        return month;
    }

    // Return the year
    public int getYear() {
        return year;
    }

    // Sets the day. No input validation
    public void setDay(int day) {
        this.day = day;
    }

    // Sets the month. No input validation
    public void setMonth(int month) {
        this.month = month;
    }

    // Sets the year. No input validation
    public void setYear(int year) {
        this.year = year;
    }

    // Sets the date. No input validation
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns a descriptive String in the form "DD/MM/YYYY" with leading zero 
    public String toString() {
        return String.format("%02d:%02d:%4d",day,month,year);
    }
}
