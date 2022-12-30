package generic;

public class MyData implements Comparable<MyData> {
    private int month;
    private int day;
    private int year;

    public MyData(int year, int day, int month) {
        this.year = year;
        this.month = month;
        this.day = day;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyData{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }

    @Override
    public int compareTo(MyData o) {
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        int mouthMinus = month - o.getMonth();
        if (mouthMinus != 0) {
            return mouthMinus;
        }
        return day - o.getDay();
    }
}
