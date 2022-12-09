package tutorial;

import java.util.ArrayList;

import static tutorial.Print.printList;

/**
 * @author zhanzq
 */
public class ArrayListOp {
    public static void main(String[] args) {
        testArrayList();
    }

    public static void testArrayList(){
        Integer[] numbers = new Integer[]{1, 2, 3, 4};
        printList(numbers);

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        ArrayList<Integer> lst2 = new ArrayList<>(lst);
        printList(lst);
        lst.clear();
        printList(lst2);
    }
}
