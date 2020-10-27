package main.java.javaLesson.primitives;

public class K_Do_while {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println("hello "+ counter);
            counter++;
        } while (counter<=10);
        while (counter>=0)  {
            System.out.println("by "+ counter);
            counter--;
        }
    }
}
