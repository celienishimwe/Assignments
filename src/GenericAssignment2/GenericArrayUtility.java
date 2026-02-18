package GenericAssignment2;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericArrayUtility <T> {

    public static <T> T[] mergeArrays(T[] a, T[] b){

        T[] merge = (T[]) Array.newInstance(a.getClass().componentType(),a.length + b.length);

        for(int i=0; i< a.length; i++){

            merge[i] = a[i];
        }

        for (int i=0; i< b.length; i++){
            merge[a.length+i] = b[i];
        }

        return merge;
    }

}
