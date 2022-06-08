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
        testHashMap();
        testHashSet();
        testArrayList();
        testString();
        testInteger();
        testChar();
        testStack();
        System.out.println(convertToBase7(100));
    }

    public static void testString(){
        String s = "abc";
        String subString = s.substring(1);
        System.out.println("subString: " + subString);
        char[] chars = s.toCharArray();
        String res = String.valueOf(chars);
        System.out.println("String: " + res);
    }

    public static void testInteger(){
        Integer[] lst = new Integer[]{1, 2, 3, 4};
        printList(lst);
    }

    public static void testHashMap(){
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("world", 10);
        mp.put("hello", 3);
        printMap(mp);
    }

    public static void testHashSet(){
        HashSet<String> st = new HashSet<>();
        st.add("10");
        printSet(st);
        assert(st.contains("10"));
        st.remove("10");
        printSet(st);
    }

    public static void testArrayList(){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        ArrayList<Integer> lst2 = new ArrayList<>(lst);
        printList(lst);
        lst.clear();
        printList(lst2);
    }

    public static void testChar(){
        Map<Character, Integer> mp = new HashMap<>();
        char ch = 'A' + 5 - 1;
        mp.put(ch, 10);
        System.out.println(ch);
        Integer val = mp.get('A');
        System.out.println(val);
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

    public static void testStack(){
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        int front = stk.peek();
        System.out.println("front: " + front);
        int val = stk.pop();
        System.out.println("pop val: " + val);
    }
}

