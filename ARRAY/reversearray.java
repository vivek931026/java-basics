public class reversearray{
    // Reverse an array

    public static void reverse(int arr[]){
        int first = 0, last = arr.length - 1;
        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        
    }

    //pairs in an array
    public static void pairs(int[] arr){
        int tp = 0;
        for (int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+ tp);
    }

    //subarray
    public static void subArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i+1; j<arr.length; j++) {
                int end = j;
                for (int k=start; k<=end; k++) { //print
                    System.out.print(arr[k]+" "); //sub array
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        // reverse(arr); // reverse array
        // pairs(arr); // pairs in an array
        subArray(arr);
    }
}