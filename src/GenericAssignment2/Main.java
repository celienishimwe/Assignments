package GenericAssignment2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer  [] array1 = new Integer [] {1,2,3,4};
        Integer [] array2 = new Integer[] {5,6,7,8};

        String [] array3 = new String[] {"Celie"};
        String[]  array4 = new String[] {"Nishimwe"};

       Integer[] result = GenericArrayUtility.mergeArrays(array1,array2);

       String[] result2 = GenericArrayUtility.mergeArrays(array3,array4);
       System.out.println("The final merged array is :"+ Arrays.toString(result));

        System.out.println("the final merged array is:"+ Arrays.toString(result2));

    }
}
