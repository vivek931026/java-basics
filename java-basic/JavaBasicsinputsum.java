import java.util.Scanner;


public class JavaBasicsinputsum {
    public static void main (String args[]){
        
        // sum of two (taking input)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a:  ");
        int a = sc.nextInt();

        System.out.println("Enter value of b:  ");
        int b = sc.nextInt();

        // int sum = a+b; // sum 
        int product = a*b;
        sc.close(); 

        System.out.println("sum of a+b: " + product);
        
    }
}