/**
 * This is a Class for heap.
 */
final class Heap {
    /**
     * Constructs the object.
     */
    private Heap() {
    /**
     * empty constructer.
     */
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * Time complexity is O(N log N).
     *
     * @param      pq    the array to be sorted
     */
    public static void sort(final Comparable[] pq) {
        int n = pq.length;
        for (int k = n / 2; k >= 1; k--) {
            sink(pq, k, n);
        }
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n);
        }
    }
    /**
     * to sink the values.
     * Time complexity is O(log N).
     *
     * @param      pq    { parameter_description }
     * @param      k     { int value }
     * @param      n     { int value }
     */
    private static void sink(final Comparable[] pq, final int k, final int n) {
        int l = k;
        while (2 * l <= n) {
            int j = 2 * l;
            if (j < n && less(pq, j, j + 1)) {
                j++;
            }
            if (!less(pq, l, j)) {
                break;
            }
            exch(pq, l, j);
            l = j;
        }
    }

    /**
     * to compare the values.
     * Time complexity is 1.
     *
     * @param      pq    { parameter_description }
     * @param      i     { int value }
     * @param      j     { int value }
     *
     * @return     { description_of_the_return_value }
     */
    private static boolean less(final Comparable[] pq, final int i,
        final int j) {
        return pq[i - 1].compareTo(pq[j - 1]) < 0;
    }

    /**
     * to exchange the values.
     * Time complexity is O(N).
     *
     * @param      pq    { parameter_description }
     * @param      i     { int value }
     * @param      j     { int value }
     */
    private static void exch(final Object[] pq, final int i, final int j) {
        Object swap = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = swap;
    }

    /**
     * to display the data.
     * Time complexity is O(N).
     *
     * @param      a     { comparable value }
     */
    private static void show(final Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}