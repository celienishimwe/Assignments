package FuctionalCalculatorBiFunction;
import java.util.Scanner;
import java.util.function.BiFunction;

public class FunctionalCalculator {

    public static Integer calculate(int a, int b, BiFunction<Integer,Integer,Integer> operation){
        return operation.apply(a,b);
    }


    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a + b;
        BiFunction<Integer,Integer,Integer> sub = (a,b) -> a -b;
        BiFunction<Integer,Integer,Integer> mult = (a,b) -> a * b;
        BiFunction<Integer,Integer,Integer> div = (a,b) -> a/b;

        Scanner user_input = new Scanner(System.in);
        System.out.println("enter number one:");
        int number1= user_input.nextInt();

        System.out.println("enter number two:");
        int number2= user_input.nextInt();

        if (number1 !=0 && number2 !=0){

            int result1 = FunctionalCalculator.calculate(number1,number2,add);
            System.out.println("the output of addition is :" + result1);

        }
        System.out.println("please enter number above 0");


    }
}
