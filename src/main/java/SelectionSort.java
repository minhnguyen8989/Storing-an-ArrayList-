import java.util.ArrayList;
import java.util.Comparator;

/**
 * A utility class that provides a static method to sort a list of {@link Student} objects
 * using the selection sort algorithm and a provided {@link Comparator}.
 */
public class SelectionSort {
    /**
     * Sorts the specified list of students using the selection sort algorithm
     * based on the order defined by the given comparator.
     *
     * @param list       the list of {@code Student} objects to be sorted
     * @param comparator the comparator used to compare {@code Student} objects
     */
    public static void sort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }

            Student temp = list.get(minIdx);
            list.set(minIdx, list.get(i));
            list.set(i, temp);
        }
    }
}
