package tutorial;

/**
 * @author zhanzq
 */
public class StringOp {

    public static void main(String[] args) {
        testString();
        testStringBuilder();
    }

    public static void testString(){
        String s = "hello, world";
        split(s, " ");
        charAt(s, 4);
        toCharArray(s);

        String subString = s.substring(1);
        System.out.println("subString: " + subString);
        char[] chars = s.toCharArray();
        String res = String.valueOf(chars);
        System.out.println("String: " + res);
    }

    public static void testStringBuilder(){
        StringBuilder sb = new StringBuilder("hello, world!");
        sb.append(" hi");
        System.out.println(sb);
        sb.replace(14, 17, "");
        System.out.println(sb);
        // common method: append, delete, insert, reverse, indexOf
        System.out.println("origin string: " + sb);
        sb.delete(5, 7);
        System.out.println("after delete: " + sb);
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
