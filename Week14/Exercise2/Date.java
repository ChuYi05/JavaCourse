package Week14.Exercise2;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[][] daysPerMonth = {{0,31,28,31,30,31,30,31,31,30,31,30,31},
            {0,31,29,31,30,31,30,31,31,30,31,30,31}};

    public Date(int theMonth, int theDay, int theYear){
        month = setMonth(theMonth);
        year = theYear;
        day = setDay(theDay);
    }

    public int setMonth(int theMonth){
        if(theMonth > 0 && theMonth <=12)
            return theMonth;
        else
            throw new IllegalArgumentException("month must be 1-12");
    }

    public int setDay(int theDay){
        if(year % 400 == 0 || (year %4 == 0 && year % 100 != 0)){
            if(theDay > 0 && theDay <= daysPerMonth[1][month])
                return theDay;
        }
        else{
            if(theDay > 0 && theDay <= daysPerMonth[0][month])
                return theDay;
        }
        throw new IllegalArgumentException("day out-or-range for the specified month and year");
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        return String.format("%d/%d/%d",month,day,year);
    }

}
