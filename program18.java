//program for checking enter character is uppercase,lowercase or string..
import java.util.Scanner;

public class program18 {
    static String userInput(char userChar)
    {
        String answer=null;
        int uChar = userChar;
        if(uChar>=65 && uChar<=90)
            answer = "Entered character is in upper case";
        else if(uChar>=97 && uChar<=122)
            answer = "Entered character is in lower case";
        else if(uChar>=48 && uChar<=57)
            answer = "Entered character is Number";
        else
            answer = "Invalid input";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char userChar = sc.next().charAt(0);
        System.out.println(userInput(userChar));
    }
}
