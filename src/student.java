import java.util.ArrayList;

/**
 * @ClassName student
 * @Description TODO
 * @Author Administrator
 * @Date 2019/8/5  22:36
 * @Version 1.0
 **/
public class student {
    public static final int jsajl=12;
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a = " + a);
        String arr[]=new String[]{"LiLei","zhangsan","xiaoming"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        ArrayList<Object> list = new ArrayList<>();
        for (Object o : list) {

        }

    }
}
