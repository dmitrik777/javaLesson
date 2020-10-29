package test.java.lesson6;

import main.java.javaLesson.objects.Cat;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CatDPTest {
    Cat cat;

    @BeforeMethod
    public void setUp(){
         cat = new Cat("Dimka");
    }

    @Test(dataProvider = "dataProvider")
    public void setAgeTest(int ageToSet, int expectedAge){

        cat.setAge(ageToSet);
        int actualAge = cat.getAge();
        assertEquals(actualAge, expectedAge, String.format("expected number is %d, but actual is %d",expectedAge,actualAge));

    }

    @DataProvider(name = "dp")
    public Object[][] dataProvider(){
        int arr[] = {};
        return new Object[][] {
                {0,20},
                {20,20},
                {30,20}
        };

    }
}
