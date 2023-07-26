//sum of given two numbers

import java.util.Scanner;

public class program12 {
    
    static int sumDouble(int num1,int num2)
    {
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Sum is : "+sumDouble(num1,num2));
    }
}
