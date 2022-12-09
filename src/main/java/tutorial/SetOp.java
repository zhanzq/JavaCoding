package tutorial;

import java.util.HashSet;

import static tutorial.Print.printSet;

/**
 * @author zhanzq
 */
public class SetOp {
    public static void main(String[] args) {
        testHashSet();
    }

    public static void testHashSet(){
        HashSet<String> st = new HashSet<>();
        st.add("10");
        printSet(st);
        assert(st.contains("10"));
        st.remove("10");
        printSet(st);
    }
}
