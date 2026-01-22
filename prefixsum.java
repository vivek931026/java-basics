public class prefixsum{

    public static void prefxsum(int num[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefixsum[] = new int[num.length];
        prefixsum[0] = num[0];
        for (int i=1; i<num.length; i++){
            prefixsum[i] = prefixsum[i-1] + num[i];
        }


        for (int i=0; i<num.length; i++){
            int start=i;
            for (int j=i; j<num.length; j++){
                int end=j;

                currSum = start == 0 ? prefixsum[end] : prefixsum[end] - prefixsum[start - 1];
            
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }

    public static void main(String[] args) {
    int num[] = {1,-1,5,4,7};
    prefxsum(num);
    
    }
}