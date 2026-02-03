import java.util.*;
public class string{
    public static void main(String[] args){
        // String str = "ab cd";
        // String str2 = new String("xyz@123#");
        

        Scanner sc = new Scanner(System.in);
        //next is only take one word like vivek and Line help to take input full length 
        // String name = sc.nextLine();
        // System.out.println(name);
        
        // finding length of string 

        // System.out.println(name.length());

        //concatenation 
        String firstName = "Vivek";
        String lastName = "Maurya";
        String fullName = firstName + " " + lastName;

        // System.out.println(fullName);

        // string charAt method
        System.out.println(fullName.charAt(4));


        sc.close();
    }
}