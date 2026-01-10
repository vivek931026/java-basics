// Java practice file
// Topics: functions, loops, basic logic
public class func{
    public static void printhellowworls(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    // calculate sum function
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    // product function
    public static int multiply(int a, int b){
        int product = a * b;
        return product; 
    }

    // factorial of a number 
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    // binomial coefficient function 
    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * (fact_nmr));
        return binCoeff;
    }

    //function overloading
    // we function same and return type is different it give error of duplicacy
    //calculate sum of 2 number
    public static int sum(int a, int b){
        return a + b;
    }

    //calculate sum of 3 number
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // Check prime no or not 
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for (int i = 2; i <= n-1; i++) {
    //         if (n % i == 0) { // completely dividing 
    //            isPrime = false;
    //            break; 
    //         }
    //     }
    //     return isPrime;
    // } 

    // optimized
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // completely dividing 
               return false;
            }
        }
        return isPrime;
    } 

    // primes in range 
    public static void primeInRange(int n){
        for (int i = 2; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //binary number to decimal no 
    public static void binToDec(int bin){
        int binnum = bin;
        int pow = 0;
        int dec = 0;
        while (bin > 0) { 
            int lastdigit = bin % 10;
            dec = dec + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        System.out.println("decimal of "+ binnum + " = " + dec);
    }

    // decimal to binary 
    public static void decToBin(int n){
        int num = n;
        int bin = 0;
        int pow = 0;
        while (n > 0){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Decimal no "+num+" = "+bin);
    }


    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);
        // System.out.println("sum is : " + sum);

        // // swap 
        // int c = 10;
        // int d = 1;
        // c = d;
        // System.out.println("d value " + d);

        // System.out.println(factorial(6));

        // System.out.println(binCoeff(5,2));  //calculate binomial coefficient     

        // System.out.println(sum(5,2, 8));

        // System.out.println(isPrime(2)); // for checking prime no

        // primeInRange(100); // Finding prime in range

        // binToDec(11101); // binary to decimal 
        
        // decToBin(7); // decimal to binary
        
    }

}
