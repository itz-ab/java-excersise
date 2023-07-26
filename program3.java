//program for counting months & days from  given days..
import java.util.Scanner;

public class program3 {
    
    static String covertDaysIntoMonthsAndDays(int days)
    {
        int month = days/30;
        int day = days - month*30;
        return month+" month & "+day+" days";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days : ");
        int days = sc.nextInt();
        System.out.print(covertDaysIntoMonthsAndDays(days));
    }
}
