package test.test_collection;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Join", 12);
//        hashMap.put("Mike", 14);
//        hashMap.put("Bill", 17);
//        hashMap.put("Maria", 20);
//
//        System.out.println(hashMap.get("Join"));
//
//        Set<String> keys = hashMap.keySet();
//        for(String key:keys) {
//            System.out.println("key: "+ key + ": "+ hashMap.get(key));
//        }

//        Map<Integer, String> myMap = new HashMap<>();
//        myMap.put(1, "one");
//        myMap.put(2,"two");
//        myMap.put(3,"three");
//
//        System.out.println(myMap.get(1));
//        System.out.println("-------");
//
////        for(Integer key: myMap.keySet()) {
////            System.out.println(myMap.get(key));
////        }
//
//        Map<Integer, String> myMap2 = new HashMap<>();
//        myMap2.put(4,"four");
//        myMap2.put(5,"");
//
//        myMap.putAll(myMap2);
////        System.out.println(myMap);
//
//        myMap.remove(4);
////        System.out.println(myMap.size());
////
////        System.out.println(myMap.containsValue("nine"));
//
//        System.out.println(myMap2);



//        Map<Integer, String> myTreeMap = new TreeMap<>();
//        myTreeMap.put(2,"two");
//        myTreeMap.put(1,"one");
//        myTreeMap.put(5,"five");
//
//        for(Map.Entry<Integer,String> entry:myTreeMap.entrySet() ){
//            System.out.println(entry.getKey()+ " " + entry.getValue());
//        }

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
