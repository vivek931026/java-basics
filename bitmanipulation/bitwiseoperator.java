public class bitwiseoperator{

    //finding odd or even by using bit manipulation 
    public static void oddOrEven(int n){
        int bitMask =1;
        if((n & bitMask )== 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

    }
    //Get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask )== 0){
            return 0;
        }else{
            return 1;
        }

    }

    //set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }


    public static void main(String[] args){
    
    // //binary AND &
    // System.out.println(5 & 6);
    // // binary or
    // System.out.println(5 | 6);
    // // binary XOR
    // System.out.println(5 ^ 6);
    // // binary one's complement (~)
    // System.out.println(~5);
    // // binary leftshift
    // System.out.println(5 << 2);
    // // binary rightshift
    // System.out.println(6 >> 1);

    // oddOrEven(39);

    // System.out.println(getIthBit(10,1));
    
    // System.out.println(setIthBit(10,0));

    System.out.println(clearIthBit(10, 1));

    }
}