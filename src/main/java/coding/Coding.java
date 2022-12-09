package coding;

/**
 * @author zhanzq
 */
public class Coding {


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

