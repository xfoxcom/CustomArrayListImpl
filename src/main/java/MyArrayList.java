
/**
 * ArrayList interface. ArrayList can store elements of different types.
 *
 * @param <T> is the type of elements in this arraylist.
 */
public interface MyArrayList<T> {

    void add(T t);

    void set(int index, T t);

    void insert(int index, T t);

    int size();

    T get(int index);

    void delete(int index);

    void clear();

}
