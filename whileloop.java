import java.util.*;
public class whileloop {
    public static void main(String args[]){
        // while loop
        int counter = 0;
        while (counter < 3){
            System.out.println("Hello world!");
            counter++;
        }
        
        // print number from 1 to 10
        int n = 1;
        // while (n <= 10){
        //     System.out.print(n+ " ");
        //     n++;
        // }

        System.out.println("print number from 1 to x");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        while (n <= x){
            System.out.println(n + " ");
            n++;
        }

        // Print sum of first n natural number 
        System.out.println("enter the no for print natural no");
        int m = 1;
        int T = 0;
        int k = sc.nextInt();
        while (m <= k){
            T += m;
            m++;
        }
        System.out.println(T);

    }
}
