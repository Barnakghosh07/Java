import java.util.*;
public class basics {
    public static void main(String[] args) {
        // int n = 10899;
        // int rev = 0;

        // while(n>0) {
        //     int lastDigit = n%10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n/10;
        // }

        //  System.out.println(rev);

        
        
        // do while loop

        // int counter = 1;
        // do {
        //     System.out.println("hello world");
        //     counter++;
        // } while(counter <= 10);




        //Break Statement 
         
    //     for(int i=1; i<=5; i++) {
    //     if(i == 3) {
    //         break;
    //       }
    //         {
    //         System.out.println(i);
    //         }
    //  System.out.println("I am the out of the loop");
    //     }   


    //Enter The number until 10;

    Scanner sc = new Scanner(System.in);

    do {
        System.out.print("Enter the element");
        int n = sc.nextInt();
        
        if(n % 10 == 0) {
            break;
        }
        System.out.prntln(n);
    } while(true);











    }
}