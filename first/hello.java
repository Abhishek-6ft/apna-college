package first;

public class hello {
    public static void change(int arrs[], int i, int val){
        // base
        if (i == arrs.length) {
            parrsay(arrs);
            return;
        }

        // recursion
        arrs[i] = val;
        change(arrs, i+1, val+1);
        arrs[i] = arrs[i];
    }
    public static void parrsay(int arrs[]){
        for(int i=0; i<arrs.length; i++){
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arrs[] = new int[5];
        change(arrs, 0, 1);
        parrsay(arrs);        
    }
}