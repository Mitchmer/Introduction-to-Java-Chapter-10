// Design a class named Time. The class contains:

// The data fields hour, minute, and second that represent a time.
// A no-arg constructor that creates a Time object for the current time. 
// (The values of the data fields will represent the current time)
// A constructor that constructs a Time object with a specified elapsed time since midnight, 
// January 1, 1970, in milliseconds. (The values of the data fields will represent this time)
// A constructor that constructs a Time object with the specified hour, minute, and second.
// Three getter methods for the data fields hour, minute, and second, respectively.
// A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. 
// For example, if the elapsed time is 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10
// Write a main method that creates three Time objects (using new Time(), new Time(555550000), 
// and new Time(5, 23, 55)) and displays their hour, minute, and second in the format hour:minute:second.

public class Project1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("" + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        Time time2 = new Time(555550000);
        System.out.println("" + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        Time time3 = new Time(5, 23, 55);
        System.out.println("" + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());


    }
}

class Time {
    private long hour;
    private long minute;
    private long second;

    Time() {
        this(System.currentTimeMillis());
        this.second = this.second % 60;
        this.minute = this.minute % 60;
        this.hour = this.hour % 24;
    }
    Time(long milliseconds) {
        this.second = milliseconds / 1000;
        this.minute = this.second / 60;
        this.hour = this.minute / 60;

        this.second = this.second % 60;
        this.minute = this.minute % 60;
        this.hour = this.hour % 24;
    }
    Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    long getHour() {
        return this.hour;
    }
    long getMinute() {
        return this.minute;
    }
    long getSecond(){
        return this.second;
    }

    void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        this.second = totalSeconds % 60;
        this.minute = totalMinutes % 60;
        this.hour = totalHours % 24;
    }
}
