/*
program that return large value of given two values,
return smaller value if mod is same after divide both values by 5,
return 0 if both values are same..
*/
import java.util.Scanner;

public class program16 {
    
    static int maxMod5(int num1,int num2)
    {
        int result=0;
        if(num1==num2)
            result = 0;
        else if(num1%5==num2%5)
            result = (num1<num2)?num1:num2;
        else
            result = (num1>num2)?num1:num2;
        return result;
   }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second value : ");
        int num2 = sc.nextInt(); 
        System.out.println("Answer is : "+maxMod5(num1,num2));
   }
}
