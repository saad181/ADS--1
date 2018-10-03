/**
 * Class for merge.
 */
class Merge {
    /**
     * var_description.
     */
    private static final int CUTOFF = 7;
    /**
     * Constructs the object.
     */
    Merge() { }
    /**
     * function_description.
     *
     * @param      array     The array
     * @param      aux      The newarray
     * @param      lo        The lower
     * @param      mid       The middle
     * @param      hi        The higher
     */
    private static void merge(final Comparable[] array,
        final Comparable[] aux, final int lo,
        final int mid, final int hi) {
        assert isSorted(array, lo, mid);
        assert isSorted(array, mid + 1, hi);

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                aux[k] = array[j++];
            } else if (j > hi) {
                aux[k] = array[i++];
            } else if (less(array[j], array[i])) {
                aux[k] = array[j++];
            } else {
                aux[k] = array[i++];
            }
        }
        /**
         * item_description.
         */
        assert isSorted(aux, lo, hi);
    }
    /**
     * function_description.
     *
     * @param      array     The array
     * @param      aux     The newarray
     * @param      lo        The lower
     * @param      hi        The higher
     */
    private static void sort(final Comparable[] array,
        final Comparable[] aux, final int lo, final int hi) {
        if (hi <= lo + CUTOFF) {
            insertionSort(aux, lo, hi);
            System.out.println("Insertion sort method invoked...");
            return;
        }
        int mid=lo + (hi - lo) / 2;
        sort(aux, array, lo, mid);
        sort(aux, array, mid + 1, hi);

        if(!less(array[mid + 1], array[mid])) {
           for (int i = lo; i <= hi; i++) {
            aux[i] = array[i];
            }
            System.out.println("Array is already sorted. " +
                "So, skipped the call to merge...");
           return;
        }
        merge(array, aux, lo, mid, hi);
    }
    /**
     * function_description.
     *
     * @param      a     { parameter_description }
     */
    public static void sort(final Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length - 1);
        assert isSorted(a);
    }
    /**
     * function_description.
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     */
    public static void insertionSort(final Comparable[] a, final  int lo,
        final int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
    /**
     * function_description.
     *
     * @param      a     { parameter_description }
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    public static void exch(final Comparable[] a, final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    /**
     * function_description.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
    /**
     * Determines if sorted.
     *
     * @param      a     { parameter_description }
     *
     * @return     True if sorted, False otherwise.
     */
    public static boolean isSorted(final Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    /**
     * Determines if sorted.
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     *
     * @return     True if sorted, False otherwise.
     */
    public static boolean isSorted(final Comparable[] a,
        final int lo, final int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    /**
     * function_description.
     *
     * @param      a     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static Object show(final Object[] a) {
        String s = "[";
        int i;
        for (i = 0; i < a.length - 1; i++) {
            s += a[i] + ", ";
        }
        s = s + a[a.length - 1] + "]";
        return s;
    }
}