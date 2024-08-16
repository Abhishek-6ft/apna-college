package day08_Array;

public class Linear_Search {

    public static int Linearsearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }
    

    // public static String menu(String dish[],String hungry){
    //     for(int i= 0; i< dish.length; i++){
    //         if (dish[i] == hungry) {
    //             return hungry;
    //         }
    //     }
    //     return "no food";
    // }

    public static void main(String[] args) {
        // String dish[] = {"dosa", "chole", "samosa", "juice"};
        // String hungry ="samosa";
        
        // String index = menu(dish,hungry);
        // if (index == hungry) {
            //     System.out.println("no food");
            // }else{
                //     System.out.println("khana dedo");
            // }
                
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 28};
        int key = 20;

        int index = Linearsearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");

        }else{
            System.out.println("Key is at index : " + index);
        }
    }
}
