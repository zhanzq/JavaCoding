import java.util.*;

public class Coding {

    private static <T> void printList(ArrayList<T> lst){
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

    private static <T> void printList(T[] lst){
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

    private static <T> void printSet(Set<T> st){
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

    private static <T1, T2> void printMap(Map<T1, T2> mp){
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

    public static void main(String[] args){
        System.out.println(convertToBase7(100));
    }

    public static String convertToBase7(int num){
        StringBuilder sb = new StringBuilder();
        if(num == 0){
            sb.append('0');
        }else{
            boolean neg = false;
            if(num < 0){
                neg = true;
                num = -num;
            }
            while(num > 0){
                sb.insert(0, num%7);
                num /= 7;
            }
            if(neg){
                sb.insert(0, '-');
            }
        }
        return sb.toString();
    }
}

