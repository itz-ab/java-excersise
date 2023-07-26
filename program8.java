//program for printing month name by number..

import java.util.Scanner;

public class program8 {
     static String displayMonthAsString(int monthNo)
    {
        String Month="";
        switch(monthNo)
        {
            case 1:
                Month = "January";
                break;
            case 2:
                Month = "February";
                break;
            case 3:
                Month = "March";
                break;
            case 4:
                Month = "April";
                break;
            case 5:
                Month = "May";
                break;
            case 6:
                Month = "June";
                break;
            case 7:
                Month = "July";
                break;
            case 8:
                Month = "August";
                break;
            case 9:
                Month = "Septmber";
                break;
            case 10:
                Month = "Ocober";
                break;
            case 11:
                Month = "November";
                break;
            case 12:
                Month = "December";
                break;
            default:
                Month = "Enter valid month number..";
        }
        return Month;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number : ");
        int monthNo = sc.nextInt();
            System.out.println("Month is : "+displayMonthAsString(monthNo));
    }
}
