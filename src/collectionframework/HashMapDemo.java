package collectionframework;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apeksha");
        map1.put(2, "Parth");
        map1.put(3, "Rudra");


        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Apeksha");
        map2.put(2, "Parth");
        map2.put(3, "Rudra");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Apeksha");
        map3.put(2, "Parth");
        map3.put(3, "Rudra");

        List<Map<Integer, String>> list = Arrays.asList(map1, map2, map3);

        list.forEach(s -> {
            s.forEach((k, v) -> {
                System.out.println(k + " " + v);
            });
            System.out.println();
        });

        for (Map.Entry<Integer, String> map :map1.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
        System.out.println();


        Iterator<Map.Entry<Integer, String>> iterator = map1.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}