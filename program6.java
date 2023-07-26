//program for checking number is even or not..
import java.util.Scanner;

public class program6 {
    static boolean isEven(int number)
    {
        return (number%2==0)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(number+" is Even : "+isEven(number));

    }
}
