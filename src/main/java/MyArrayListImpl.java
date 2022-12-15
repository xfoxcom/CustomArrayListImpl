import java.util.Arrays;

/**
 * The Arraylist is a resizable array.
 *
 * @param <T> is the type of elements in this arraylist.
 */
public class MyArrayListImpl<T> implements MyArrayList<T> {

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] list;

    /**
     * Initializes arraylist with default capacity.
     */
    public MyArrayListImpl() {
        list = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Initializes array list with custom capacity.
     *
     * @param capacity custom capacity.
     */
    public MyArrayListImpl(int capacity) {

        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity!");

        list = new Object[capacity];
    }

    /**
     * Add an element to the list.
     *
     * @param t element
     */
    @Override
    public void add(T t) {
        if (size == list.length) increaseCapacity();
        list[size++] = t;
    }

    /**
     * Insert a new element to the specified index.
     *
     * @param t     a new element.
     * @param index index in the array list.
     */
    @Override
    public void insert(int index, T t) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound!");
        }

        if (size + 1 == list.length) increaseCapacity();

        for (int i = size - 1; i >= index; i--)
            list[i + 1] = list[i];
        list[index] = t;
        size++;
    }

    /**
     * Set a new element to the specified index.
     *
     * @param index in the array list.
     * @param t     inserting element.
     */
    @Override
    public void set(int index, T t) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound!");
        }

        list[index] = t;

    }

    /**
     * Get an element by its index.
     *
     * @param index index of the element.
     */
    @Override
    public T get(int index) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound!");
        }

        return (T) list[index];
    }

    /**
     * Delete an element by its index.
     *
     * @param index index of the element.
     */
    @Override
    public void delete(int index) {

        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound!");

        for (int i = index; i < size() - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;

    }

    /**
     * Clear collection.
     * Set size to zero.
     */
    @Override
    public void clear() {

        for (int i = size - 1; i >= 0; i--) {
            list[i] = null;
        }

        size = 0;

    }

    /**
     * @return size of the collection.
     */
    @Override
    public int size() {
        return size;
    }

    private void increaseCapacity() {
        int newSize = list.length * 2;
        list = Arrays.copyOf(list, newSize);
    }

    /**
     * Equals method to compare two array lists.
     * @param o comparing object
     * @return equals or not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyArrayListImpl<?> that)) return false;
        return size == that.size && Arrays.equals(list, that.list);
    }

}
