package day10_String;

public class StringCompression {
    public static String compress(String Str){
        String newStr = "";
        for (int i = 0; i < Str.length(); i++) {
            Integer count = 1;
            while (i<Str.length()-1 && Str.charAt(i) == Str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += Str.charAt(i);
            if (count > 1 ) {
                newStr += count.toString();
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        String Str = "abhj";
        System.out.println(compress(Str)); 
    }
}
