//print 1 to 10 using for and while loop..

public class program10 {
    static void print1To10()
    {
        System.out.println("Using for loop : ");
        for(int i=1;i<=10;i++)
            System.out.print(i+" ");
        System.out.println("\nUsing while loop : ");
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
    }

    public static void main(String[] args) {
        
        print1To10();
    }
}
