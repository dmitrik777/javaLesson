package main.java.javaLesson.primitives;

public class O_Array {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int arr[] = {10,20,30,40,50};
        arr[0] = 1000;
        String strs[] = {"dima", "puka", "mama"};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(strs);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        for (int el: arr) {
            System.out.println(el);
        }
    }
}
