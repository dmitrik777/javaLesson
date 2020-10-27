package test.java.lesson5;

import main.java.javaLesson.objects.Cat;
import main.java.javaLesson.objects.HW1;

public class FirstTest {
    public static void main(String[] args) {
//        setAgePositive();
//        setAgePositive2();
        getNamesTest();
    }
public static void getNamesTest(){
   String actualResult = HW1.getNames();
    System.out.println(actualResult);

    String strArr[] = actualResult.split("\n");
    System.out.println("lines amount " + actualResult.split("\n").length);
    for (String el: strArr) {
        String namesArr[] = el.split(" ");
        System.out.println("names in line: " + namesArr.length);
    }
}

    /*getNamesTest(){
    String actualResult = HW1.getNames();
        System.out.println();}
}*/


    public static void setAgePositive(){
            Cat cat = new Cat("DimkaKot");
            int expectedAge = 1232;
            cat.setAge(expectedAge);
            int actualAge = cat.getAge();
        System.out.println("Age: " + (expectedAge == actualAge));
        if(expectedAge != actualAge){
            throw new Error("Failed!");
        }
    }
    public static void setAgePositive2(){
        Cat cat = new Cat("DimkaKot");
        int expectedAge = 1232;
        cat.setAge(expectedAge);
        int actualAge = cat.getAge();
        System.out.println("Age: " + (expectedAge == actualAge));
        if(expectedAge != actualAge){
            throw new Error("Failed!");
        }
}}
