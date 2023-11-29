/**
 * Name: Matthew Klug (klug)
 * Course: CSCI-241 - Computer Science I
 * Section: 001
 * Assignment 9
 * Project/Class Description: Create a ClockTime blueprint with attributes hours/minutes/seconds
 * Known bugs: Syntax Perfection
 */
public class ClockTime
{
    //this type of object keeps time in the 24-hour format
    
    //Instance variables
    private int hour;
    private int minute;
    private int second;
    //Constructor without parameters 
    public ClockTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;        
    }
    //Constructor with parameters
    public ClockTime(int hour, int minute, int second) {
        //If paremeters are negative, set them to zero
        if (second<0) second = 0;
        if (minute<0) minute = 0;
        if (hour<0) hour = 0;
        
        //Add extra seconds/minutes to minute/hour
        minute += second/60;
        hour += minute/60;
        
        //Insert values into variables within correct parameter
        if (hour > 24) hour %= 24;
        if (minute > 59) minute %= 60;
        if (second > 59) second %= 60;
        
        //Set instance variables
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //Second getter
    public int getSecond() {
        return this.second;
    }
    //Minute getter
    public int getMinute() {
        return this.minute;
    }
    //Hour getter
    public int getHour() {
        return this.hour;
    }
    //Second setter
    public void setSecond(int input) {
        if (second<0) second = 0;
        minute += second/60;
        if (second > 59) second %= 60;
        this.second = input;
    }
    //Minute setter
    public void setMinute(int input) {
        if (minute<0) minute = 0;
        hour += minute/60;
        if (minute > 59) minute %= 60;
        this.minute = input;
    }
    //Hour setter
    public void setHour(int input) {
        if (hour<0) hour = 0;
        if (hour > 24) hour %= 24;
        this.hour = input;
    }
    //toString method (military time)
    public String toString() {
        String clean = String.format("%02d:%02d:%02d", hour, minute, second);
        return clean;
    }
    //toString method (non military time)
    public String toString12() {
        if (hour>12) {
            int newTime = hour % 12;
            String clean = String.format("%02d:%02d:%02d P.M.", newTime, minute, second);
            return clean;
        } else {
            String clean = String.format("%02d:%02d:%02d A.M.", hour, minute, second);
            return clean;
        }
    }
    //Advance ClockTime by parameter
    public void advance(int seconds) {
        this.second+=seconds;
        if (second<0) second = 0;
        minute += second/60;
        if (second > 59) second %= 60;
        hour += minute/60;
        if (minute > 59) minute %= 60;
        if (hour > 24) hour %= 24;
    }
    //Checks if two clocks hold the same values
    public boolean equals(ClockTime Clock) {
        boolean isEqual = false;
        if (this.hour == Clock.hour && this.minute == Clock.minute && this.second == Clock.second) {
            isEqual = true;
        }
        return isEqual;
    }
    }