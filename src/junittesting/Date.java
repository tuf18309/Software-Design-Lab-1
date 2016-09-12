package junittesting;

public class Date {

    int year;
    int month;
    int day;

    final int daysPerYear = 365;
    final int daysPerMonth = 30;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int daysTo(Date d2) {
        int totalDays = 0;
        int totalYears = 0;
        int totalMonths = 0;

        totalYears = Math.abs(this.year - d2.year);
        totalMonths = Math.abs(this.month - d2.month);
        totalDays = (daysPerYear * totalYears) + (daysPerMonth * totalMonths) + Math.abs(this.day - d2.day);
        
        return totalDays;
    }
}
