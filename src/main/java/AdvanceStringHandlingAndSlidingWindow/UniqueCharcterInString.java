package AdvanceStringHandlingAndSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharcterInString {
    public static void main(String[] args) {
        String string = "Programming";
        System.out.println("Input string: " + string);
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c :  string.toCharArray()){
            if(map.containsKey(c)){
                map.put(c ,map.get(c)+1);
            }
            else {
                map.put(c , 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
