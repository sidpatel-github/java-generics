package Erasure;

public class InstanceOfIssue<T> {

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstanceOfIssue/*<T>*/) {
            return true;
        }
        return false;
    }
}
