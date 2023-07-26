//program that check whether one of given two number is 7 or sum of them is 7 or diffrence of them is 7..
import java.util.Scanner;

public class program13 {
    static boolean isOneNumberOrSumOrDiffIs7(int num1,int num2)
    {
        boolean result;
        if(num1==7||num2==7)
            result=true;
        else if(num1-num2==7||num1+num2==7)
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
        System.out.println("Answer is : "+isOneNumberOrSumOrDiffIs7(num1,num2));
    }
}
