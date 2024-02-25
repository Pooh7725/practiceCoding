package main.hashset;

import java.util.ArrayList;
import java.util.Arrays;


public class maxAndSecondMaxNum {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(22, 2, 4, 7, 3, 22, 8, 9, 0, 20));
        MaxAndSecMax(array);
    }
    public static void  MaxAndSecMax(ArrayList<Integer>input){
        int max= -1;
        int smax= -1;
      for(int i=0;i<input.size();i++) {
          if(input.get(i)> max){
              smax = max;
              max = input.get(i);
          } else if (input.get(i)>smax) {
              smax = input.get(i);

          }
      }
        System.out.println("value of max : " + max+ " value of smax : " + smax );
    }
}
