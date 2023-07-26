import java.util.Scanner;

public class program19 {
    
    static int dispalyNumberBasedOnInput(int number)
    {
        int result = (number%2==0) ? number/2 : number*3+1;

        return result;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(dispalyNumberBasedOnInput(number));
    }
}
