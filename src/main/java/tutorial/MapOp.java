package tutorial;

import java.util.HashMap;
import java.util.Map;

import static tutorial.Print.printMap;

/**
 * @author zhanzq
 */
public class MapOp {
    public static void main(String[] args) {
        testHashMap();
    }

    public static void testHashMap(){
        HashMap<String, Integer> mp = new HashMap<>(20);
        // common methods: put, get, remove, keySet, containsKey, containsValue,
        // entrySet
        mp.put("hello", 10);
        for(String key: mp.keySet()){
            int val = mp.get(key);
            System.out.println("key: " + key + ", val: " + val);
        }
        for(Map.Entry<String, Integer> it : mp.entrySet()){
            String key = it.getKey();
            int val = it.getValue();
            System.out.println("key: " + key + ", val: " + val);
        }
        mp.put("world", 10);
        mp.put("hello", 3);
        printMap(mp);
    }
}
