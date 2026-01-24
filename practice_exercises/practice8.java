import java.util.Scanner;

public class practice8{
    public static void main(String [] args){
        // Create a scanner object to read input from the user 
        Scanner sc = new Scanner(System.in);

        //Write a program that reads a set of integers, and then prints the sum of the even and odd integers
        // System.out.print("enter the number of integers: ");
        // int n = sc.nextInt();

        // int even = 0;
        // int odd = 0;

        // System.out.println("Enter "+ n +" integers: ");
        // for (int i=0; i<n; i++){
        //     // taking input of integer no
        //     int num = sc.nextInt();
        //     if (num%2 == 0){
        //         even += num;
        //     }else{
        //         odd += num;      
        //     }
        // }

        // System.out.println("total odd on of: "+ odd);
        // System.out.println("tatal even on of: "+ even);

        // Write a program to find the factorialof any number entered by the user
        // System.out.print("enter a non-negative integer: ");
        // int num = sc.nextInt();

        // if (num < 0){
        //     System.out.println("factorial does not exist for negative number ");
        // }else{
        //     long sumOfFactorial = 1;
        //     for (int i=1; i <= num; i++){
        //         sumOfFactorial *= i;
        //     }
        //     System.out.println("Factorial of" + num + " is: " + sumOfFactorial);
        // }

        // Write a program to print the multiplication table of a number N, entered by the user
        System.out.print("write number for multiplication table : ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){
            int table = n*i;
            System.out.println(n+" * "+ i +" = "+table);
        }

        sc.close();
    }
}