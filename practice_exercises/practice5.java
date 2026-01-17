import java.util.*;

public class practice5 {
    public static void main (String args[]){

        int $ = 24;
        System.out.println($);

        //Inaprogram,input 3 numbers:A, B and C. You have to out put the average of these 3 numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no for avg : ");
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("average is : " + avg);


        // In a program,input the side of a square.You have to output the area of the square

        System.out.println("Enter side value: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("area of square : "+ area);

        // Enter cost of 3 items from the user(using float data type)-a pencil,a pen and
        // an eraser. You have to output the total cost of the items back to the user as their bill

        System.out.println("Enter price of Pencil : ");
        float Pencil = sc.nextFloat();
        System.out.println("Enter price of Pen : ");
        float Pen = sc.nextFloat();
        System.out.println("Enter price of Eraser : ");
        float Eraser = sc.nextFloat();

        float total = (Pencil + Pen + Eraser);
        System.out.println("total bil : "+ total);

        float gst = (total * 18 ) / 100;
        float with_gst = (total + gst);
        System.out.println("with GST : "+ with_gst); 

        
        
    }
}