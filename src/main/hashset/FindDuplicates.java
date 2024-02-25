package main.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
    public static ArrayList<Character> findDuplicates(String str) {
        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> dup = new HashSet<>();
        for(int i =0;i<str.length();i++) {
            if (hs.contains(str.charAt(i))) {
                dup.add(str.charAt(i));
            } else {
                hs.add(str.charAt(i));
            }
        }
        ArrayList<Character> result = new ArrayList<>();
        for (Character ch : dup) {
            result.add(ch);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hulululu";
        ArrayList<Character> res = findDuplicates(str);
        System.out.println(res);
    }
}
