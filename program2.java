//program for calculate area of circle

import java.util.Scanner;

public class program2 {
    static float giveAreaOfCircle(float radius)
    {
        float area = 3.14f * (radius*radius);
        return area;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        float radius = sc.nextFloat();
        System.out.println("Area is "+giveAreaOfCircle(radius));
    }
}
