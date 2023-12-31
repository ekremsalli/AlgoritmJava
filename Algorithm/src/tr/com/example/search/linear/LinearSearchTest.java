package tr.com.example.search.linear;

import tr.com.example.array.fill.ArrayFill;
import tr.com.example.array.print.ArrayPrint;
import tr.com.example.array.search.ArrayUtilSearch;

import java.util.Random;

public class LinearSearchTest {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random r = new Random();
        ArrayFill.arrayFillRandom(array,r);
        ArrayPrint.print(array);
        System.out.println();
        //System.out.println(LinearSearch.linearSearch(tr.com.example.array,5));
        System.out.println(ArrayUtilSearch.largestNumber(array));
        System.out.println(ArrayUtilSearch.secondLargestNumber(array));

        int[] array2 = {1,2,3,4,5,6,6,7,7,8,8,8};

        System.out.println(ArrayUtilSearch.largestNumber(array2));
        System.out.println(ArrayUtilSearch.secondLargestNumber(array2));

    }
}
