//program for counting divisible by 3 or 5 between given range..
import java.util.Scanner;

public class program11 {
    
    static int countNumbersDivisibleBy3Or5(int minNum ,int maxNum)
    {
        int result=0;
        for(int i=minNum;i<=maxNum;i++)
        {
            if(i%3==0||i%5==0)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minimum number : ");
        int minNum = sc.nextInt();
        System.out.print("Enter maximum number : ");
        int maxNum = sc.nextInt();
        System.out.println("Result : "+countNumbersDivisibleBy3Or5(minNum,maxNum));
    }
}
