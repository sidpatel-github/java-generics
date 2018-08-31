package generics_intro;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeMain {
    public static void main(String[] args) {

        StringCircularBuffer buffer = new StringCircularBuffer(5);

        buffer.offer("x");
        buffer.offer("xy");
        buffer.offer("xyz");

        //This will throw an compile-time error
//        buffer.offer(1);

        System.out.println(concatenate(buffer));
    }

    private static String concatenate(StringCircularBuffer buffer) {
        StringBuilder concatStr = new StringBuilder();
        String value;
        while ((value = buffer.poll()) != null) {
            concatStr.append(value);
        }
        return concatStr.toString();
    }
}