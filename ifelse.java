import java.util.*;
public class ifelse2 {
    public static void main(String args[]) {
    
    int num = 4;

    // ternary operator 
    String type = ((num%2) == 0) ? "Even" : "Odd";
    System.out.println(type);
        
    // check if a student will pass or fail 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter marks: ");
    int marks = sc.nextInt();
    
    String result = (33 < marks) ? "pass" : "fail";
    System.out.println(result);

    // Switch statement 

    int number = 2;
    switch(number){
        case 1 : System.out.println("samosa");
                    break;
        case 2 : System.out.println("burger");
                    break;
        case 3 : System.out.println("mango shake");
                    break;
        default : System.out.println("we wake up");
    }

    }
}

