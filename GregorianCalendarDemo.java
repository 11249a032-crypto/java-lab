import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Current Date: " + cal.get(GregorianCalendar.DATE));
        System.out.println("Current Month: " + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Current Year: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Day of Week: " + cal.get(GregorianCalendar.DAY_OF_WEEK));
    }
}