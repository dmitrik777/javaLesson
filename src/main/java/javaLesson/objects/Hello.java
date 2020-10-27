package main.java.javaLesson.objects;

public class Hello {
    public static void main(String[] args) {
        Cat barsik = new Cat ("Bars");
        Cat barsik2 = new Cat("Tiger", "Tigrovich");
        Cat barsik3 = barsik;
        barsik3.name = "Dimka";
        System.out.println(barsik);
        System.out.println(barsik2);
        System.out.println(barsik==barsik2);
        System.out.println(barsik.name);
        barsik.meow();
        barsik.sleep();
        barsik.sayHello( "Dima");
        barsik.sayHello();
        barsik.sayHello("Max", 2 );
        System.out.println(barsik.getFullName());
        System.out.println(barsik.name);
        System.out.println(barsik2.getFullName());
    }
}
