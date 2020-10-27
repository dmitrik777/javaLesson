package test.java.lesson6;

import main.java.javaLesson.objects.Cat;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CatTests {
    @Test
    public void setAgePositive(){
        //arrange
        int ageToSet = 10;
        int expectedAge = 10;
        Cat cat = new Cat("MyCat");
        //act
        cat.setAge(ageToSet);
        int actualAge = cat.getAge();
        //assert
        //assertEquals(actualAge, 3);
        assertTrue(actualAge == 1000, String.format("Expected age %d, but actual is %d", 1000,actualAge));


    }
    @Test
    public void checkEqualsIfTrue(){
        Cat cat1 = new Cat("dima");
        Cat cat2 = new Cat("dima");
        boolean isEquals = cat1.equals(cat2);
        assertFalse(isEquals,"cats is equals");
    }
}
