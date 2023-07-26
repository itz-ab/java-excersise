//program for checking number is positive or not..
import java.util.Scanner;

public class program5{

    static boolean isNumberPositive(int number)
    {
        return (number>0)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(number+" is positive : "+isNumberPositive(number));

    }
}
