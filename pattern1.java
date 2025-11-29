public class pattern1{
    public static void main(String args[]){
        // print star pattern
        // *
        // **
        // ***
        // ****
        for (int row = 1; row <= 4; row++){
            for (int col = 1;  col <= row; col++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // print invented-star pattern
        // ****
        // ***
        // **
        // *
        int n = 4;
        for (int row = 1; row <= n; row++ ){
            for (int col = 1;  col <=n - row + 1; col++ ){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
