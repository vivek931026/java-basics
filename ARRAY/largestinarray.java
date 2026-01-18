import java.util.*;
public class largestinarray{

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest value is: "+ smallest);
        return largest;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // largest no in array
        int arr[] = new int [6];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        arr[5] = sc.nextInt();
        System.out.print("array: "+arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " "+ arr[4]+ "  "+ arr[5]+"\n");

        System.out.println("largest no is: " + getLargest(arr));



    }
}
