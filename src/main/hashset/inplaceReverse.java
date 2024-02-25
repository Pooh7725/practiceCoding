package main.hashset;

import java.util.ArrayList;

public class inplaceReverse {

    public static void main(String[] args) {
        String str = "i love ramen maggie and biryani";
        String res = inplacerev(str);
        System.out.println(res);

    }
    public static String reverseWords(String words){
    String rev = "";
    for (int i=words.length()-1 ; i>=0 ;i--){
        rev += words.charAt(i);
    }

    return rev;
    }
    public static String inplacerev (String sen){
        ArrayList<String> res = new ArrayList<>();
        String[] split= sen.split(" ");
        for(int i=0;i< split.length;i++){
            String temp = reverseWords(split[i]);
            res.add(temp);
        }
        return String.join(" " ,res);
    }
}
