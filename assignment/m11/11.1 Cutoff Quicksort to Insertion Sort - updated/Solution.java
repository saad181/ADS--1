import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for insertion sort.
 */
class InsertionSort {
    /**
     * Constructs the object.
     */
    InsertionSort() {
        // System.out.println("In Insertion Sort");
    }
    /**
     * Public Method to sort Array of elements.
     *
     * @param      a     { parameter_description }
     * @param      low    The lowwer
     * @param      hi    The higher
     *
     * @return     { description_of_the_return_value }
     */
    public Comparable[] insertionSort(final Comparable[] a,
        final int low, final int hi) {
        return sort(a, low, hi);
    }
    /**
     * private Method to Sort Array of elements using Insertion Sort.
     * The Complexity of Insertion Sort is O(N^2)
     * It has two lowops for comparing and swapping the elements
     * For this the worst case complexity is O(N^2)
     *
     * @param      a     { Array elements to Sort }
     * @param      low    The lowwer
     * @param      hi    The higher
     *
     * @return     { Sorted Array }
     */
    private Comparable[] sort(final Comparable[] a,
        final  int low, final int hi) {
        int j = 0;
        // System.out.println(hi + " Hi");
        for (int i = low + 1; i <= hi; i++) {
            j = i - 1;
            Comparable temp = a[i];
            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        return a;
    }
}
/**
 * Class for quick sort.
 */
class QuickSort {
    /**
     * Cutoff Specified by User.
     */
    private int cutoff;
    /**
     * Object for insertion Sort Class.
     */
    private InsertionSort insertion;
    /**
     * Constructs the object.
     *
     * @param      cut   The cut
     */
    QuickSort(final int cut) {
        cutoff = cut;
        insertion = new InsertionSort();
    }

    /**
     * Method to call Private Quick Sort Method.
     *
     * @param      a       { Array to be Sorted }
     */
    public void qSort(final Comparable[] a) {
        int low = 0;
        int hi = a.length - 1;
        qSort(a, low, hi);
    }

    /**
     * Method to Sort the elements using Quick Sort.
     * The complexity is O(N^2)
     * This is not Stable based upon pivot element selection.
     * It iterates two lowops to find the pivot element and sort.
     *
     * @param      a     { Arrat=y to be Sorted }
     * @param      low    The lowwer
     * @param      hi    The higher
     */
    private void qSort(final Comparable[] a, final int low, final int hi) {
        // System.out.println("In Quick Sort   " + cutoff);
        if (hi - low + 1 <= cutoff) {
            insertion.insertionSort(a, low, hi);
            System.out.println("insertionSort called");
            return;
        }
        int j = partition(a, low, hi);
        qSort(a, low, j - 1);
        qSort(a, j + 1, hi);
    }

    /**
     * Partition the Array using Pivot Element.
     *
     * @param      a     { Array to be Sorted }
     * @param      low    The lowwer
     * @param      hi    The higher
     *
     * @return     { Index of the Paartitioned element in Array }
     */
    private int partition(final Comparable[] a, final int low, final int hi) {
        int i = low + 1;
        int k = low;
        int j = hi;
        while (true) {
            while (less(a[i], a[k])) {
                i++;
                if (i == hi) {
                    break;
                }
            }
            while (less(a[k], a[j])) {
                j--;
                if(j == low) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            exchange(a, i, j);
            i++;
        }
        exchange(a, j, k);
        System.out.println(Arrays.toString(a));
        return j;
    }
    /**
     * Less method to Compare the Less one.
     *
     * @param      a     { Object Comparable 1 }
     * @param      b     { Object Comparable 2 }
     *
     * @return     { True or False based upon less value than 0. }
     */
    private boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * Exchange method swap the elements in the Array.
     *
     * @param      a     { Array of comparable type. }
     * @param      i     { index of element to be Swapped }
     * @param      k     { index of second element to be swapped }
     */
    private void exchange(final Comparable[] a, final int i, final int k) {
        Comparable temp = a[k];
        a[k] = a[i];
        a[i] = temp;
    }
}

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main Method to Sort the Elements using Quick Sort.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            int cutoff = sc.nextInt();
            sc.nextLine();
            String[] tokens = sc.nextLine().split(" ");
            if (tokens[0].length() == 0) {
                System.out.println("[]");
            } else {
                QuickSort quick = new QuickSort(cutoff);
                quick.qSort(tokens);
                System.out.println(Arrays.toString(tokens));
            }
            num--;
        }
    }
}