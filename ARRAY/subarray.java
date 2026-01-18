public class subarray {
    // subarray 
    //largest and smallest subarray
    //total no of subarray
    public static void sub(int num[]){
        int ts=0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end=j;
                int sumofsub = 0;
                for (int k=start; k<=end; k++) {
                    System.out.print(num[k]+" ");
                    sumofsub += num[k]; 
                }
                ts++;
                System.out.println("sum of subarray: "+sumofsub+" ");
                if(largest < sumofsub){
                    largest = sumofsub;
                }
                if (smallest >  sumofsub ) {
                    smallest = sumofsub;
                }
            }
            System.out.println();
        }
        System.out.println("largest sum of sub arr is: "+largest);
        System.out.println("smallest sum of sub array: "+smallest);
        System.out.println("total subarray: "+ ts);

    }   

    public static void main(String [] args){
        int num[] = {1,-2,6,-1,3};
        sub(num);

    }
}
