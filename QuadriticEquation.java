import java.util.Scanner;
public class QuadriticEquation {


    public static void main(String[] Strings) {
        int t1 = 0, t2 = 1;
        int noOfTerms = 15;
        System.out.println("The first " + noOfTerms + " terms of pell series :")
        for (int i = 1; i <= noOfTerms; i++) {
            if (i == 1) {
                System.out.println(t1 + " ");
            } else if (i == 2) {
                System.out.println(t2 + " ");
            } else {
                int t3 = t1 + t2 * 2;
                System.out.println(t3 + " ");
                t1 = t2;
                t2 = t3;
            }
        }
    }
}

