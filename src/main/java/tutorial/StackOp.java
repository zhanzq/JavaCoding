package tutorial;

import java.util.Stack;

/**
 * @author zhanzq
 */
public class StackOp {
    public static void main(String[] args) {
        testStack();
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
