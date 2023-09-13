package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {

              // String str = "I am in Pune";   //for string,integers
        //        String str = "I am in Pune".replaceAll("\\s",""); //for characters

        String str = "I am in Pune".replaceAll("\\s","").toLowerCase();  //for lowercase characters

           //    String[] strings = str.split(" ");
       char[] chars = str.toCharArray();

       // Map<String, Integer> map = new LinkedHashMap<>();

        Map<Character, Integer> map = new LinkedHashMap<>();

       // for(String sc:strings){
            for(Character sc:chars){
            if(map.containsKey(sc)){
                map.put(sc, map.get(sc)+1);
            } else {
                map.put(sc,1);
            }
        }
        System.out.println(map);
    }
}
