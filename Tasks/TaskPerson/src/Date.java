public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public Date(Date other) {

    }

    public int getDay() {
        return day;
    }

    public void setDay(int dayToSet) {
        this.day = dayToSet;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int monthToSet) {
        this.month = monthToSet;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearToSet) {
        this.year = yearToSet;
    }

    public boolean equals(Date other) {
        if (this == other) return true;
        if (other == null) return false;
        return this.year == other.getYear() &&
                this.month == other.getMonth() &&
                this.day == other.getDay();

    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }

}
