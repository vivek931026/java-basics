import java.util.*;

public class JavaBasicsinput {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.next();

        sc.nextLine();

        System.out.println("Enter a full sentense: ");
        String sentence = sc.nextLine();

        System.out.println("Enter an integer: ");
        int integer = sc.nextInt();  

        System.out.println("Enter a decimal number: ");
        double decimalL = sc.nextDouble(); // 2556.255553

        System.out.println("Enter a decimal number: ");
        float decimalS = sc.nextFloat();

        System.out.println("Enter true or false: ");
        boolean possible = sc.nextBoolean(); // true or false 

        System.out.println("word: " + word);
        System.out.println("sentence: " + sentence);
        System.out.println("integer: " + integer);
        System.out.println("decimalL: " + decimalL);
        System.out.println("decimalS: " + decimalS);
        System.out.println("possiblel: " + possible);

        
    }

}