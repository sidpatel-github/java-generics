package generics_intro;

public class GenericsCircularBuffer<T> {

    private final T[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public GenericsCircularBuffer(int size) {
        buffer = (T[]) new Object[size];
    }

    public boolean offer(T value) {
        if (buffer[writeCursor] != null) {
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public T poll() {
        T value = buffer[readCursor];
        if (value != null) {
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    //This will move out pointers to next location
    private int next(int index) {
        return (index + 1) % buffer.length;
    }
}