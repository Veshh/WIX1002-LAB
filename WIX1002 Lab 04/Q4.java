import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year): ");
        int firstDay = scanner.nextInt();
        
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int[] daysInMonths = {31, isLeap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        
        int currentDay = firstDay;
        int[] startDays = new int[12];
        for (int i = 0; i < 12; i++) {
            startDays[i] = currentDay;
            currentDay = (currentDay + daysInMonths[i]) % 7;
        }
        
        int[] targetMonths = {4, 7}; // May (4) and August (7)
        for (int m : targetMonths) {
            printCalendar(monthNames[m], year, daysInMonths[m], startDays[m]);
            System.out.println();
        }
        scanner.close();
    }
    
    public static void printCalendar(String monthName, int year, int numDays, int startDay) {
        System.out.println("     " + monthName + " " + year);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}