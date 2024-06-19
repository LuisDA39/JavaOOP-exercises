public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }
    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Today's date is: " + getMonth() + "/" + getDay() + "/" + getYear();
    }

    public static void main(String[] args) {
        Date date = new Date(2,4,2018);
        System.out.println(date);

        date.setDay(30);
        date.setMonth(1);
        date.setYear(2023);

        System.out.println(date);
    }
}
