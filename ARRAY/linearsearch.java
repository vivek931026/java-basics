public class linearsearch {
    //Linar search
    // public static int linearSearch(int number[], int key){
    //     for(int i = 0; i<number.length; i++){
    //         if (number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    //linear search for menu 
    public static int menuSearch(String menu[], String ky){
        for (int i = 0; i<menu.length; i++){
            if (menu[i] == ky){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        // int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;

        // int index = linearSearch(number, key);
        // if (index == -1){
        //     System.out.println("NOT found");
        // }else{
        //     System.out.println("key find at index: "+ index);
        // }

        String menu[] = {"dosa", "chole bhature", "samosa", "fruity"};
        String ky = "samosa";

        int indx = menuSearch(menu, ky) ;
        if (indx == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key find at: " + indx );
        }
        


    }
}
