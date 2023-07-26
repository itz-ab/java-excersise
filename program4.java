//program for checking number is greater then 3 or not..
import java.util.Scanner;

public class program4 {

    static boolean isNumberGreaterThanThree(int number)
    {
        return (number>3)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(number+" is greater then 3 : "+isNumberGreaterThanThree(number));

    }
}
