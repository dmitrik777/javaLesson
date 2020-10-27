package main.java.javaLesson.primitives;

public class R_Exceptions {
    public static void main(String[] args) {
        first();

    }
    public static void first(){
        System.out.println("FIRST");
        second();

    }
    public static void second(){
        System.out.println("SECOND");
        third();
        System.out.println("AFTER THIRD");

    }
    public static void third(){
        System.out.println("THIRD");
        System.out.println(10/0);

    }
}
