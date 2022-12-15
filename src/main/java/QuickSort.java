/**
 * Quick Sort Algorithm with last index pivot.
 */
public class QuickSort {

    /**
     * Sort the arraylist with quick sort algorithm.
     */
    public <T extends Comparable<? super T>> void quickSort(int start, int end, MyArrayListImpl<T> arrayList) {

        if (start < end) {

            int pivotIndex = partition(start, end, arrayList);

            quickSort(start, pivotIndex - 1, arrayList);

            quickSort(pivotIndex + 1, end, arrayList);
        }

    }

    private <T extends Comparable<? super T>> int partition(int startIndex, int endIndex, MyArrayListImpl<T> array) {

        T pivot = array.get(endIndex);

        int i = startIndex;

        for (int j = startIndex; j < endIndex; j++) {

            if (array.get(j).compareTo(pivot) < 0) {

                exchange(i, j, array);
                i++;

            }
        }

        exchange(i, endIndex, array);

        return i;
    }

    private <T extends Comparable<? super T>> void exchange(int j, int i, MyArrayListImpl<T> array) {
        T temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }

}
