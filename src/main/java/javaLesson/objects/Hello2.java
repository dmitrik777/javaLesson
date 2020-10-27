package main.java.javaLesson.objects;

public class Hello2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("vasiliy");
        Cat cat2 = new Cat("vasiliy");
        Cat cat3 = new Cat("vasiliy");
        Cat cat4 = new Cat("vasiliy", "tiger");
        System.out.println("number of cats " + Cat.getCounter());

        //cat1.age = 5;
        cat1.setAge(20);
        cat1.sleep();
        //cat1.protectedMethod();

        Shark shark = new Shark();
        shark.sleep();

        System.out.println(cat1.equals(cat2));



       // System.out.println("age is: " + cat1.getAge());

    }

}
