public class pattern2{

    // hallow rectangle pattern
    // ****
    // *  *
    // *  *
    // ****
    public static void hallow_rectangle(int totalrow, int totalcol){
        //outer line
        for (int i = 1; i<=totalrow; i++){
            //inner line
            for (int j = 1; j<=totalcol; j++){
                if (i == 1 || i == totalrow || j == 1 || j == totalcol) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // inverted & rotated half - pyramid
    //    *
    //   **
    //  ***
    // ****
    public static void inv_half_pyramid(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted half-pyramid with no
    // 12345
    // 1234
    // 123
    // 12
    // 1
    public static void inv_half_pyramidno(int n){
        int m = n;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print(j+" ");
            }
            m--;
            System.out.println();
        }
    }

    // floyd's triangles
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void floydTriangle(int n){
        int m = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }

    // 0-1 triangle
    // 1
    // 0 1 
    // 1 0 1 
    // 0 1 0 1
    // 1 0 1 0 1
    public static void zero_one_triangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if ( (i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // buterfly pattern
    // *      *
    // **    **
    // ***  ***
    // ********
    // ********
    // ***  ***
    // **    **
    // *      *
    public static void butterfly(int n){
        for (int i = 1; i <= n; i++) {
            //star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
             //star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        
        // hallow_rectangle(4,5);
        // inv_half_pyramid(50 );
        // inv_half_pyramidno(5 );
        // floydTriangle(5);
        // zero_one_triangle(5);
        butterfly(4);

    }
}