//program for calculating grade acording to the score..
import java.util.Scanner;

public class program17 {
    
    static char findGradeOfStudent(int score)
    {
        char grade='A';

        if(score>=91 && score<=100)
            grade='A';
        else if(score>=81 && score<=90)
            grade='A';
        else if(score>=71 && score<=80)
            grade='B';
        else if(score>=61 && score<=70)
            grade='C';
        else if(score>=51 && score<=60)
            grade='D';
        else if(score>=41 && score<=50)
            grade='E';
        else if(score<40)
            grade='F';
        return grade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score : ");
        int score = sc.nextInt();
        if(score>=91&&score<=100)
            System.out.println("Grade : "+findGradeOfStudent(score)+"+");
        else
            System.out.println("Grade : "+findGradeOfStudent(score));
    }
}
