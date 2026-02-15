import java.util.Scanner;

public class practice10{

    //Q1:- Write a Java method to compute the averageof three numbers
    public static void avgOfThree(int one,int two,int  three){
        int avg = (one + two + three) / 3;
        System.out.println(avg);
    }

    //Q2:- Write a method name disEven that accepts an intargument.The method should return true if the argument is even, or false other wise.Also write aprogram to test your method.
    public static boolean evenOrOdd(int nums){
        if(nums % 2 == 0){
            return true;
        }
        return false;
    }

    //Q3:- Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
    public static boolean palindrome(int n){
        int rev = 0;
        int num = n;
        while(num > 0){
            int digit = num%10; //reminder
            rev = (rev*10)+ digit;
            num = num/10;
        }
        if(n == rev){
            return true;
        }else{
            return false;
        }
    }

    //Q4 Write a Java method to compute the sum of the digits in an integer
    public static void sumOfTheDigit(int nums){
        int res = 0;
        while (nums > 0) {
            int digit = nums % 10;
            res += digit;
            nums = nums/10;
        }
        System.out.println(res);
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int one = 78, two= 59, three=83;

        //Q1:- Write a Java method to compute the averageof three numbers
        // avgOfThree(one, two, three);

        //Q2:- Write a method name disEven that accepts an intargument.The method should return true if the argument is even, or false other wise.Also write aprogram to test your method.
        // int num = sc.nextInt();
        // System.out.println(evenOrOdd(num));

        // Q3:- Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
        // int n = sc.nextInt();
        // System.out.println(palindrome(n));
        
        //Q4 Write a Java method to compute the sum of the digits in an integer
        sumOfTheDigit(1234);


        sc.close();
    }
}