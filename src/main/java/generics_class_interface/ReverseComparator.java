package generics_class_interface;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

    private final Comparator<T> sortedComparator;

    public ReverseComparator(Comparator<T> sortedComparator) {
        this.sortedComparator = sortedComparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return -1 * sortedComparator.compare(o1, o2);
    }
}
