package day10_String;

public class stringBuilder {

    public static String toUpperase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z'; ch++){
        //     sb.append(ch);
        // }

        // System.out.println(sb);
        String str = "hi i am abhishek";
        // System.out.println(str.toUpperCase());
        System.out.println(toUpperase(str));
    }
}
