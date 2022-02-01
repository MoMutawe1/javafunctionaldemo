package functionalinterface;

import java.net.Inet4Address;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println("imperative approach result: " + increment);

        int incrementResult = incrementByOneFunctional.apply(0);
        int multiplyResult = multiplyByTen.apply(10);
        System.out.println("increment result: " + incrementResult);
        System.out.println("multiply result: " + multiplyResult);

        Function<Integer, Integer> addByOneAndMultiplyWithTen = incrementByOneFunctional.andThen(multiplyByTen);
        //System.out.println(addByOneAndMultiplyWithTen.apply(5));
        int multiFunResult = addByOneAndMultiplyWithTen.apply(5);
        System.out.println("Add By One And Multiply By Ten: " + multiFunResult);

        int incrementByOneAndMultiplyByTenBiFunResult = incrementByOneAndMultiplyByTenBiFun.apply(3,9);
        System.out.println("Increment By One And Multiply By Ten BiFunction: " + incrementByOneAndMultiplyByTenBiFunResult);
    }

    static int incrementByOne(int number){
        return number + 1;
    }

    static int incrementByOneAndMultiplyByTen(int incrementBy, int MultiplyBy){
        return (incrementBy + 1) * MultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByTenBiFun = ( incrementBy,  MultiplyBy) -> (incrementBy + 1) * MultiplyBy;

    static Function<Integer, Integer> incrementByOneFunctional = number -> number + 1;
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;
}
