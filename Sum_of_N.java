import java.util.*;

public class basics {
    public static void main(String[] args) {

       // Sum of N Natural Numbers

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i =  1;
        while(i<=n) {
            sum += i;
            i++;
        }
        
        System.out.println(sum);

        
        //How To use For loop
        
        // // for(int i =1; i<=10; i++){
        // //     System.out.println("hello");
        // // }

        // //Print Square Pattern

        // for(int line = 1; line<=4; line++){
        //     System.out.println("****");
        // }






    }
}