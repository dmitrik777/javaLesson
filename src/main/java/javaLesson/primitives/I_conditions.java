package main.java.javaLesson.primitives;

public class I_conditions {
    public static void main(String[] args) {
        int age = 80;
        if (age <=18){
            System.out.println("access denied!!!");
        } else if (age > 18 && age <70){
            System.out.println("hello, user!");
        }
        else if (age >=70){
            System.out.println("access denied!!!");
    }
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
}}


