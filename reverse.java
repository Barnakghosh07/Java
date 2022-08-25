import java.util.*;

public class basics {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int last_digit = n%10; last_digit++){
        //     System.out.println("last_digit");
        // }

        int n = 12345;
        while(n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit + " ");
            n = n / 10;
        }

        System.out.println();






    }
}