package generics_class_interface;

public class SortedPairMain {
    public static void main(String[] args) {
        SortedPair<Integer> sortedPair = new SortedPair<>(5, 10);

        System.out.println(sortedPair.getFirst());
        System.out.println(sortedPair.getSecond());

        SortedPair<Integer> sortedPairchange = new SortedPair<>(10, 5);

        System.out.println(sortedPairchange.getFirst());
        System.out.println(sortedPairchange.getSecond());

    }
}
