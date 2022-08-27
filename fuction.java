import java.util.*;

public class basics {
    public static void hellofuction() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    
    public static int calculatesum(int a, int b){ // Parameters or Formal Parameters
        int sum = a+b;
        return sum;

    }
    

    public static void main(String[] args) {

        // hellofuction(); //This is fuction call;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum =  calculatesum(a, b); // Arguments or actual parameters
        System.out.println("Here is your sum: " + sum);


    }
}