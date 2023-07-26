//c\program for checking given number is in incresing order or not..

import java.util.Scanner;

public class program15 
{  
    static boolean inOrderEqual(int num1,int num2,int num3,boolean equalOK)
    {
        boolean result = false;
        if(equalOK){
            if(num1<=num2)
            {
              if(num1<=num3)
                if(num2<=num3)
                   result=true;
              else
                result=false;
            }
         }
         else{
            if(num1<num2)
            {
              if(num1<num3)
                if(num2<num3)
                   result=true;
              else
                result=false;
            }
         }
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
        System.out.println("Answer : "+inOrderEqual(5,5,7,false));
    }
}
