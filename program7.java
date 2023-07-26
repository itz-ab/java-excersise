//program for checking whether number is divisible or not..
import java.util.Scanner;

public class program7 {
    
    static boolean isNumberDivisiblyBySeven(int number)
    {
        return (number%7==0)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(number+" is divisible by 7 : "+isNumberDivisiblyBySeven(number));

    }
}
