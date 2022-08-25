import java.util.*;

public class basics {
    public static void main(String[] args) {
        // for(int i =1; i<=5; i++) {
        //     if(i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        Scanner sc = new Scanner(Syetem.in);
        do {
            System.out.print("enter your number : ");

            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }

            System.out.println(n);
        } while(true);
        
    }
}