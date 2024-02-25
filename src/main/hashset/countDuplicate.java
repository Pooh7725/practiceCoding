package main.hashset;

import java.util.HashMap;

public class countDuplicate {

    public static void main(String[] args) {
        String str = " hululuhulualugulu";
        HashMap<Character,Integer> res = countDup(str);
        System.out.println(res);
        for(var e : res.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }
    public static HashMap<Character, Integer> countDup(String str){
        HashMap<Character, Integer> hs  = new HashMap<Character, Integer>();
        for(int i = 0 ;i<str.length();i++){
            if(hs.containsKey(str.charAt(i))){
                int value = hs.get(str.charAt(i));
                hs.put(str.charAt(i) , value+1);
            }

            else
            {
                hs.put(str.charAt(i), 1);
            }
        }
        HashMap<Character , Integer> values = new HashMap<>();
        for(var e : hs.entrySet()){
            if(e.getValue()>1){
                values.put(e.getKey(),e.getValue());
            }


        }
        return values;
    }

}
