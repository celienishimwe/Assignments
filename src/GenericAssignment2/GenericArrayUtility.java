package GenericAssignment2;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericArrayUtility <T> {


    /* this method is merging two arrays
    * First it is applying error handling on null values if one is null it print other if all are null it print null array
    * is using loop for traverse array and assign their values to merge array according to index we reached on
    * for the second loop merge array it starts to the next index according to the size of previous array
    * method is returning array values*/

    public static <T> T[] mergeArrays(T[] a, T[] b){

        T[] merge = (T[]) Array.newInstance(a.getClass().componentType(),a.length + b.length);


        if(a == null && b == null){
            return null;
        } else if (a==null) {
            return b;
        }
        else if (b == null){
            return a;
        }

        for(int i=0; i< a.length; i++){

            merge[i] = a[i];
        }

        for (int i=0; i< b.length; i++){
            merge[a.length+i] = b[i];
        }

        return merge;
    }

}
