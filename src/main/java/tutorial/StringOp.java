package tutorial;

/**
 * @author zhanzq
 */
public class StringOp {

    public static void main(String[] args) {
        String s = "hello, world";
        split(s, " ");

        charAt(s, 4);
        toCharArray(s);
    }

    public static void split(String s, String separator){
        System.out.println(s);
        String[] words = s.split(separator);
        Print.printList(words);
    }

    public static void charAt(String s, int idx){
        int sz = s.length();
        assert 0 <= idx && idx < sz;
        char ch = s.charAt(idx);
        System.out.println("s[" + idx + "] = " + ch);
    }

    public static void toCharArray(String s){
        char[] chars = s.toCharArray();
        for (char ch:
             chars) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
