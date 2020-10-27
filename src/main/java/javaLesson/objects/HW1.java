package main.java.javaLesson.objects;

public class HW1 {
    public static String getNames(){
        String result = "";
        String s = "DIMKA ";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
            result += s;
        }
        result += "\n";
    }
    return result;
}
}
