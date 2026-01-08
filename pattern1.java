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

        // half-pyramid pattern
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // for (int row=1; row<=5; row++){
        //     for(int col=1; col<=row; col++){
        //         System.out.print(col);
        //     }
        //     System.out.println();
        // }

        // character pattern
        // A
        // BC
        // DEF
        // GJIJ

        char ch = 'A';

        for (int row=1; row<=4; row++){
            for(int col=1; col<=row; col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}

