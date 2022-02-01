package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // Without Supplier
        System.out.println(getDBConnectionUrl());

        // With Supplier
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    // Without Supplier
    static String getDBConnectionUrl(){
        return "jdbc//localhost:5432/students";
    }

    // With Supplier
    static Supplier<List<String>> getDBConnectionUrlsSupplier = () -> List.of("jdbc//localhost:5432/students", "jdbc//localhost:5432/teachers");
}
