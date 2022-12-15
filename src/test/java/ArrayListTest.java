import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ArrayListTest {

    @Test
    public void index_out_of_bound_test() {

        MyArrayListImpl<Integer> integers = new MyArrayListImpl<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            integers.set(100, 5);
        });

    }

    @Test
    public void add100_elements_test() {

        MyArrayListImpl<Integer> integers = new MyArrayListImpl<>();

        for (int i = 0; i < 100; i++) {

            integers.add(i);

        }

        assertEquals(100, integers.size());

    }

    @Test
    public void add_and_get_element_test() {

        MyArrayListImpl<Integer> integers = new MyArrayListImpl<>();

        integers.add(5);
        integers.add(8);

        int current = integers.get(1);

        assertEquals(2, integers.size());
        assertEquals(8, current);
    }

    @Test
    public void delete_element_fromList_test() {

        MyArrayListImpl<Integer> integers = new MyArrayListImpl<>();

        integers.add(5);
        integers.add(8);

        int size = 2;

        assertEquals(size, integers.size());

        integers.delete(1);

        size = integers.size();

        assertEquals(1, size);


    }

    @Test
    public void clear_and_delete_list_test() {

        MyArrayListImpl<Integer> integers = new MyArrayListImpl<>();

        integers.add(5);
        integers.add(8);

        int size = 2;

        assertEquals(size, integers.size());

        integers.delete(0);

        assertEquals(1, integers.size());

        integers.clear();

        size = integers.size();

        assertEquals(0, size);


    }

    @Test
    public void insert_newElement_test() {

        MyArrayListImpl<Integer> integers = new MyArrayListImpl<>();

        integers.add(5);
        integers.add(8);

        int size = 2;

        assertEquals(size, integers.size());

        integers.insert(1, 55);

        size = integers.size();

        int current = integers.get(2);

        assertEquals(3, size);
        assertEquals(8, current);

    }
}
