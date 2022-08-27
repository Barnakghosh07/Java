import java.util.*;

public class basics {
    public static void main(String[] args) { 

        // for(int line=1; line<=5; line++){
        //     //for one line
        //     for(int star=1;star<=line;star++){
        //         System.out.print("*");
        //     }

        //     System.out.println();

            // Output 
            // *
            // **
            // ***
            // **** 
            // *****

            // int n=4;

            // for(int line=1; line<=n; line++){
            //     //for one line
            //     for(int star=1;star<=n-line+1;star++){
            //         System.out.print("*");
            //     }
    
            //     System.out.println();


                //Output
                // ****
                // ***
                // **
                // *

        // }

        //Half Pyramid 
    //     int n = 4;

    //    for(int line =1; line<=n;line++){
    //     for(int Number = 1; Number<=line; Number++){
    //         System.out.print(Number);
    //     }
    //     System.out.println();
    //    }
       //Output
    //    1
    //    12
    //    123
    //    1234
 
    // Character Pattern 
    // int n = 10;
    // char ch = 'A';
    // for(int line=1;line<=n;line++){
    //     for(int chars = 1; chars<=line; chars++){
    //         System.out.print(ch);
    //         ch++;
    //     }

    //     System.out.println();

    // }
   // Output

    //  A
    //  BC
    //  DEF
    //  GHIJ
    int n = 3;
 
    
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }

        int spaces = (n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

 
    








    }
}