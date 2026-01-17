import java.util.*;
public class ifelse1 {
    public static void main(String args[]) {
    // Print the largest of 2 number
    
    int A = 5;
    int B = 852;

    if (A >= B){
        System.out.println("A is the largest of 2");
    }else{
        System.out.println("B is the largest of 2");
    }

    // Print if no is odd or even 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n");
    int n = sc.nextInt();

    if (n%2 == 0){
        System.out.println("EVEN");
    }else {
        System.out.println("ODD");
    }

    //Income tax calculator 

    System.out.println("Enter income :");
    int income = sc.nextInt();
    int tax;

    if (income < 500000){
        tax = 0;
    }else if (income > 500000 && income < 1000000){
        tax = (int) (income*0.2);
    }else {
        tax = (int) (income*0.3);
    }

    System.out.println("Your tax is: "+ tax);

    // print the largest of 3 numbers

    int a = 521, b = 552, c = 52;
    
    if ((a >= b) && (a >= c)){
        System.out.println("A is the largest");
    }else if (b >= c){
        System.out.println("B is the largest");
    }else {
        System.out.println("C is the largest");
    }

    }
}
