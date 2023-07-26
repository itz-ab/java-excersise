import java.util.Scanner;

public class program20 {
    
    static double giveResultOfOperation(double number1, double number2, int operation)
    {
        double answer = 0;
        switch(operation)
        {
            case 1:
                answer = number1+number2;
                break;
            case 2:
                answer = number1-number2;
                break;
            case 3:
                answer = number1*number2;
                break;
            case 4:
                answer = number1/number2;
                break;
            default:
                System.out.println("Invalid operation..");
        }
        return answer;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("\n1. +\n2. -\n3. *\n4. /\nEnter operation : ");
        int operation = sc.nextInt();
        
        System.out.println("Answer : "+giveResultOfOperation(num1,num2,operation));
    }
}
