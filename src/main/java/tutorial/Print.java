package tutorial;

import java.util.*;

/**
 * @author zhanzq
 */
public class Print {
    public static void main(String[] args) {

    }

    public static <T> void printList(ArrayList<T> lst){
        int sz = lst.size();
        if(sz == 0){
            System.out.println("lst is empty!");
            return ;
        }else{
            System.out.print("lst: [" + lst.get(0));
        }
        for(int i = 1; i < sz; i++){
            System.out.print(", " + lst.get(i));
        }
        System.out.println("]");
    }

    public static <T> void printList(T[] lst){
        int sz = lst.length;
        if(sz == 0){
            System.out.println("lst is empty!");
            return ;
        }else{
            System.out.print("lst: [" + lst[0]);
        }
        for(int i = 1; i < sz; i++){
            System.out.print(", " + lst[i]);
        }
        System.out.println("]");
    }

    public static <T> void printSet(Set<T> st){
        int sz = st.size();
        if(sz == 0){
            System.out.println("set is empty!");
            return;
        }
        Iterator<T> it = st.iterator();
        System.out.print("st: {" + it.next());
        for(int i = 1; i < sz; i++){
            System.out.print(", " + it.next());
        }
        System.out.println("}");
    }

    public static <T1, T2> void printMap(Map<T1, T2> mp){
        int sz = mp.size();
        if(sz == 0){
            System.out.println("map is empty!");
            return;
        }
        Iterator<T1> keys = mp.keySet().iterator();
        T1 key = keys.next();
        T2 val = mp.get(key);
        System.out.print("st: {" + key + ": " + val);
        for(int i = 1; i < sz; i++){
            key = keys.next();
            val = mp.get(key);
            System.out.print(", " + key + ": " + val);
        }
        System.out.println("}");
    }
}
