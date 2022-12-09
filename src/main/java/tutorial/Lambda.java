package tutorial;

import java.util.Arrays;

import static tutorial.Print.printList;

/**
 * @author zhanzq
 */
public class Lambda {
    public static void main(String[] args) {
        testLambda();
    }

    public static void testLambda(){
        Integer[][] lst = {{1,2,3}, {1,3,2}};
        Arrays.sort(lst, (a, b)->{
            if(!a[0].equals(b[0])){
                return a[0] - b[0]; // ascend order
            }else{
                return b[1] - a[1]; // descend order
            }
        });
        for(Integer[] subLst: lst){
            printList(subLst);
        }
    }
}
