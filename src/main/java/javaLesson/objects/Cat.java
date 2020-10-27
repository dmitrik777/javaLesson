package main.java.javaLesson.objects;

public class Cat extends Animal {
    static int counter = 0;
    String name = "Barsik";
    String surname = "Kotov";
    private int age = 20;



    public Cat(String name){
        this.protectedMethod();
        counter++;
        this.name =name;
        System.out.println("***********new cat***********");
    }

    public Cat(String name, String surname){
        this(name);
        this.surname = surname;
           }

    public String getFullName(){
        return this.name + " " + this.surname;
    }
    public void sayHello(){
        System.out.println("I don't know you!");
    }

public void sayHello(String userName){
    System.out.printf("hello '%s' !!!", userName);
}


    public void sayHello(String userName, int amount){
        for (int i = 0; i < amount; i++) System.out.printf("hello '%s' !!!", userName);
            

    }
    public void meow (){
        System.out.println("MEOWWWWW...");


    }
    static public int getCounter(){
        System.out.println("get counter");
        return counter;
    }

    private boolean validateAge(int age) {
        if (age > 0 && age <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Cat animal){
        if(this.age == animal.age && this.name.equals(animal.name)  && this.surname.equals(animal.surname))
        {return true;}
        else {return false;}

    }

    public void setAge(int age) {
        if (this.validateAge(age)){
this.age = age;
        }else {
            System.out.println("this age " + age + " invalid!");



    }
}
public int getAge() {
    return age;
}}
