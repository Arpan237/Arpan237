import java.util.*;

public class Main {
    public static void main (String[] args){
        int x = 3;
        int a = x++;
        System.out.println(x);
        System.out.println(a);

        int b = ++x;
        System.out.println(x);
        System.out.println(b);
    }
}
