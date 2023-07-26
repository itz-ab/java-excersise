//program for calculate area of squre

import java.util.Scanner;

class program1
{
    static float giveAreaOfSquare(float side)
    {
        return side*side;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        float side = sc.nextFloat();
        System.out.println("Area is "+giveAreaOfSquare(side));
    }
}