import java.util.*;

public class forloop {
   public static void main(String args[]){
      // starting with basic 

      for (int i = 1; i <= 10; i++){
        System.out.println("hello world");
      }

      // printing Square pattern with the help of *
      for (int line = 1; line <= 4; line++){
          System.out.println("****");
      }

      // printing Square pattern with the help of * using while loop 
      int line = 1;
      while (line <= 4){
        System.out.println("****");
        line ++;
      }

      // Printing reverse of a number
      int n = 10899;
      // while(n > 0){
      //   int num = n % 10; // for printing last digit of no 
      //   n = n/10; // for deleting last digit from no
      //   System.out.print(num);
      // }

      // reverse the given number 
      int rev = 0;
      while (n > 0){
        int lastdigit = n % 10;
        rev = (rev * 10) + lastdigit;
        n = n / 10;
      }
      System.out.println(rev);

      // keep entering number till user enters a multiple of 10
      Scanner sc = new Scanner(System.in);
      int num;
      do {
        System.out.println("enter your no(break)");
        num = sc.nextInt();
        if (num % 10 == 0){
          break;
        }
        System.out.println("number was: " + num);
      }while(true);

      // Display all numbers entered by user except multiples od 10
       int number;
      do {
        System.out.println("enter your no(continue)");
        number = sc.nextInt();
        if (number % 10 == 0){
          continue;
        }
        System.out.println("number was: " + number);
      }while(true);
      

   }
}