import java.util.Arrays;

public class ArraysUtilExample {
    public static void main(String[] args) {
        
        int[] numbers = {5, 2, 8, 1, 9};
        
        System.out.println("toString: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("sort: " + Arrays.toString(numbers));
        
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("binarySearch 8: " + index);
        
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("equals: " + Arrays.equals(arr1, arr2));
        
        System.out.println("compare: " + Arrays.compare(arr1, arr2));
    }
}