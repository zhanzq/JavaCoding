package tutorial;

/**
 * @author zhanzq
 */
public class TypeConvert {
    public static void main(String[] args) {
        testConvert();
    }

    public static void testConvert(){
        // convert string to int
        String num = "123038";
        int val = Integer.parseInt(num);
        System.out.println("input string: " + num + ", output val: " + val);

        // convert int to string
        String num2 = Integer.toString(val);
        System.out.println("input val: " + val + ", output string: " + num2);

        // convert string to char[]
        String s = "hello, world!";
        char[] lst = s.toCharArray();
        System.out.println("input string: " + s + ", output char array: " + new String(lst));

        // convert char[] to string
        String s2 = new String(lst);
        System.out.println("input char array: " + new String(lst) + ", output string: " + s2);
    }
}
