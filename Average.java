import java.util.*;
//Average of three numbers

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // int avg = (A+B+C)/3;
        // System.out.println("Average is : " + avg);

        // Area of a Square

        // int r = sc.nextInt();
        // int Area = r*r;

        // System.out.println("area of the sqaure is : " + Area);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;

        System.out.println("Total Bill : " + total);

        // Add on gst 18% tax
        float newTotal = total + (total*0.18f);
        System.out.println("Bill with 18% tax : " + newTotal);

     }
}