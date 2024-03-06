package DRY;

public class MyDate {

    private long year;
    private int month;
    private int day;

    private String era;
    private int dayOfTheWeek;

    public MyDate() {
    }

    public MyDate(long year, int month, int day, String era, int dayOfTheWeek) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.era = era;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", era='" + era + '\'' +
                ", dayOfTheWeek=" + dayOfTheWeek +
                '}';
    }
}
