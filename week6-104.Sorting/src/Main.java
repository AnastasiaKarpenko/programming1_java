
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));

        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));

    }

    public static int smallest(int[] array) {

        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallest = array[index];
        int indexOfSmallest = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
    }

}
