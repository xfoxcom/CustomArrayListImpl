import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {

    @Test
    public void quick_sort_integerArray_test() {

        MyArrayListImpl<Integer> integers = new MyArrayListImpl<>();

        integers.add(5);
        integers.add(0);
        integers.add(9);
        integers.add(1);
        integers.add(4);

        MyArrayListImpl<Integer> expected = new MyArrayListImpl<>();

        expected.add(0);
        expected.add(1);
        expected.add(4);
        expected.add(5);
        expected.add(9);

        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(0, integers.size() - 1, integers);

        assertEquals(expected, integers);

    }

    @Test
    public void quick_sort_stringArray_test() {

        MyArrayListImpl<String> integers = new MyArrayListImpl<>();

        integers.add("z");
        integers.add("c");
        integers.add("x");
        integers.add("b");
        integers.add("a");

        MyArrayListImpl<String> expected = new MyArrayListImpl<>();

        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("x");
        expected.add("z");

        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(0, integers.size() - 1, integers);

        assertEquals(expected, integers);
    }

}
