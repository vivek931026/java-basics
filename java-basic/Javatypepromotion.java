
public class Javatypepromotion {
    public static void main(String args[]){
        // type promotion in expression
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b - a);


        int c = 10;
        float d = 20.25f;
        long e = 25;
        double f = 30;
        double ans = c + d + e +f;
        System.out.println(ans);
    }
}

