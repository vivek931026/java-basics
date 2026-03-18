public class Main{
    public static void main(String[] args){
        // print(1);

        //fibonacci 
        // System.out.println(fibo(6));

        //binary search by recursion 
        int[] arr={1, 2, 4, 55, 66, 78};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    // static void print(int n){
    //     if(n > 5){
    //         return;
    //     }
    //     System.out.println(n);
         //this is called tail recursion
         //this is last function call  
    //     print(n+1);
    // }

    //fibonacci number 
    // static int fibo(int n){
    //     if(n == 0 || n == 1){
    //         return n;
    //     }else{
    //         return fibo(n-1) + fibo(n-2);
    //     }

    // }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }


}