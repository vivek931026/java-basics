
public class arraysCC{
    // arrays as a function arguments
    public static void update(int price[]){
        for (int i = 0; i<price.length; i++){
            price[i] = price[i] + 100;
        }
    }

    public static void main(String args[]){
        // creating array
        int marks[] = new int[100];

        //array length
        System.out.println("array length is: " + marks.length);
        
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt(); //phy
        // marks[1] = sc.nextInt(); //chem
        // marks[2] = sc.nextInt(); //math 

        // System.out.println("physics marks: "+ marks[0] + "\nchemistry marks: "+ marks[1] + "\nmath marks: "+ marks[2]);

        // // update 

        // marks[2] = marks[2] + 2;
        // System.out.println("updated math marks: "+ marks[2]);

        // passing arrays as argument 
        int price[] = {1000,2000,1500};
        update(price);

        // print all price
        for (int i = 0; i<price.length; i++){
            System.out.print(price[i]+" ");
        }
        System.out.println();



    }
}