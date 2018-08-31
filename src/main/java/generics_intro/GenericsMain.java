package generics_intro;

public class GenericsMain {
    public static void main(String[] args) {
        GenericsCircularBuffer<String> buffer = new GenericsCircularBuffer<>(5);

        buffer.offer("x");
        buffer.offer("xy");
        buffer.offer("xyz");

       //This will throw an runtime error
//        buffer.offer(1);

        System.out.println(concatenate(buffer));
    }

    private static String concatenate(GenericsCircularBuffer<String> buffer) {
        StringBuilder concatStr = new StringBuilder();
        String value;
        while ((value = buffer.poll()) != null) {
            concatStr.append(value);
        }
        return concatStr.toString();
    }
}