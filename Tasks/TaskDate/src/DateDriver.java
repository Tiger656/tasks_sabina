import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DateDriver {
    public static void main(String[] args) {
        Date d1 = new Date(12, 02, 2023);
        Date d2 = new Date(d1.getDay(), d1.getMonth(), d1.getYear());

        Scanner in = new Scanner(System.in);
        System.out.print("Input day: ");
        int day = in.nextInt();

        System.out.printf("Input month:");
        int month = in.nextInt();

        System.out.printf("Input year:");
        int year = in.nextInt();
        in.close();

        Date d3;
        if ((day < 1 || day > 31) ||
                (month < 1 || month > 12) ||
                (year < 1000 || year > 9999)) {
            d3 = new Date(1, 1, 2023);
            System.out.println("Wrong date has been entered. Date has been reset to 01/01/2023");
        } else {
            d3 = new Date(day, month, year);
        }
        System.out.printf("Entered date: %s\n", d3);

        //Task Bet
        System.out.println(d1.equals(d2) ? "The same dates" : "different dates");

        //Task Gimel. Shall we print something if dates equal or d3 less?
        if (d1.getYear() < d3.getYear()) {
            System.out.println(d1.toString().concat(" comes before ").concat(d3.toString()));
        } else if (d1.getYear() == d3.getYear() && d1.getMonth() < d3.getMonth()) {
            System.out.println(d1.toString().concat(" comes before ").concat(d3.toString()));
        } else if (d1.getYear() == d3.getYear() && d1.getMonth() == d3.getMonth() && d1.getDay() < d3.getDay()) {
            System.out.println(d1.toString().concat(" comes before ").concat(d3.toString()));
        }

        //Task dalet
        d2.setMonth(6);

        //Task hei
        List<Date> dates = new ArrayList<>();
        dates.add(d1);
        dates.add(d2);
        dates.add(d3);
        Collections.sort(dates, (date1, date2) -> {
            if (date1.getYear() != date2.getYear()) {
                return Integer.compare(date1.getYear(), date2.getYear());
            } else if (date1.getMonth() != date2.getMonth()) {
                return Integer.compare(date1.getMonth(), date2.getMonth());
            } else {
                return Integer.compare(date1.getDay(), date2.getDay());
            }
        });

        System.out.print("Dates ASC:");
        for (int i = 0; i < dates.size(); i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(dates.get(i));
        }
    }
}

