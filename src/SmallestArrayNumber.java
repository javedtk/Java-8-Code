import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestArrayNumber {
    public static void main(String[] args) {
        int[] ar = {1,5,2,6,7,8,5,4};
        int a = 0;
        Arrays.sort(ar);
        System.out.println(ar[1]+ar[0]);
    }
}
