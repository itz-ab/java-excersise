//program for checking whether sum of the given two number is third number or not..
import java.util.Scanner;

public class program14 {
    
    static boolean twoAsOne(int num1,int num2,int num3)
    {
        boolean result;

        if(num1+num2==num3)
            result=true;
        else if(num1+num3==num2)
            result=true;
        else if(num2+num3==num1)
            result=true;
        else
            result=false;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();
        System.out.println("Answer is : "+twoAsOne(num1,num2,num3));
    }
}
