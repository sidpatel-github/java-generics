package generics_intro;

public class TypeUnsafeMain {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(5);

        buffer.offer("x");
        buffer.offer("xy");
        buffer.offer("xyz");

       //This will throw an runtime error
        buffer.offer(1);

        System.out.println(concatenate(buffer));
    }

    private static String concatenate(CircularBuffer buffer) {
        StringBuilder concatStr = new StringBuilder();
        String value;
        while ((value = (String) buffer.poll()) != null) {
            concatStr.append(value);
        }
        return concatStr.toString();
    }
}