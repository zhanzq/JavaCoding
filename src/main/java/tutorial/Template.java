package tutorial;

import java.util.*;

/**
 * @author zhanzq
 */
public class Template {

    public static <T> void singleParamTemplate(T param){
        System.out.println(param);
    }

    public static <T1, T2> void tupleParamTemplate(T1 param1, T2 param2){
        System.out.println(param1);
        System.out.println(param2);
    }

    public static <T> void arrayTemplate(T[] array){
        for(T item: array){
            System.out.print(item);
        }
        System.out.println();
    }

    public static <T1, T2> void mapTemplate(Map<T1, T2> map){
        for(T1 key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static <T> void setTemplate(Set<T> set){
        int sz = set.size();
        Iterator<T> it = set.iterator();
        System.out.print("{" + it.next());
        for(int i = 1; i < sz; i++){
            System.out.print(", " + it.next());
        }
        System.out.println("}");
    }

    public static void doTest(){
        int num = 10;
        singleParamTemplate(num);

        String s = "number";
        tupleParamTemplate(s, num);

        Long[] array = new Long[]{1L, 2L, 3L};
        arrayTemplate(array);

        HashMap<String, Integer> map = new HashMap<>(20);
        map.put("number", 10);
        mapTemplate(map);

        HashSet<Long> set = new HashSet<>();
        set.add(10L);
        setTemplate(set);
    }

    public static void main(String[] args) {
        doTest();
    }
}