import java.util.Scanner;

public class TaskQ4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1. Get the input from users
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // 2. Perform required calculation Processing
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int dayUntilMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
            int dayUntilAug = dayUntilMay + 31 + 30 + 31;
            
            // Calculate days until November 1st (adding Aug=31, Sep=30, Oct=31)
            int dayUntilNov = dayUntilAug + 31 + 30 + 31;
            int firstDayOfNov = (firstDayOfYear + dayUntilNov) % 7;
            
            // Adjust starting day so Monday is index 0 (instead of Sunday)
            int firstDayOfNovMondayStart = (firstDayOfNov - 1 + 7) % 7;

            String columnFormat = "%4s";
            String format = "%4s%4s%4s%4s%4s%4s%4s%n";

            // 3. Print the calendar of November (November has 30 days)
            System.out.println("\nNovember " + year);
            System.out.printf(format, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
            
            for (int i = 0; i < firstDayOfNovMondayStart; i++) {
                System.out.printf(columnFormat, "");
            }
            
            for (int i = 1; i <= 30; i++) {
                System.out.printf(columnFormat, i);
                if ((i + firstDayOfNovMondayStart) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
