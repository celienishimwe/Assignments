package FilterNumbers;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static List<Integer> filterEvenNumbers(List<Integer> a){


        // here I use collectors I read it in Processing Collections with Streams lesson
        List<Integer> result = a.stream().filter(b -> b%2 == 0).collect(Collectors.toList());
        return result;

    }

    public static void main(String[] args) {
        List<Integer> allNumbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filter = filterEvenNumbers(allNumbers);


        System.out.println("List before Filtering:" + allNumbers);
        System.out.println("List after Filtering:" + filter);

    }
}
