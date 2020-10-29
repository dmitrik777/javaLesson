package test.java.lesson5;

import org.testng.annotations.Test;


public class SecondTest {

    @Test
    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Minimal number: " + min(5,2,3));
    }

}
