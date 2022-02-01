package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

    // Normal Java Function call
    System.out.println(isPhoneNumberValid("0712345678"));
    System.out.println(isPhoneNumberValid("070000000"));
    System.out.println(isPhoneNumberValid("0900000007"));
    System.out.println();

    // Predicate Functional Interface call
    System.out.println(strValidPredicate.test("70242424242"));
    System.out.println(strValidPredicate.test("0777777777"));
    System.out.println(strValidPredicate.test("0077771111"));
    System.out.println();

    // Predicate Functional Interface call contains3
    System.out.println(contains3.test("123456789"));
    System.out.println(contains3.test("3300873"));
    System.out.println();

    System.out.println("Is Phone Number Valid and Contains Number 3 = " + strValidPredicate.and(contains3).test("0712345678"));
    System.out.println("Is Phone Number Valid and Contains Number 3 = " + strValidPredicate.or(contains3).test("0700000010"));
    }

    // Normal Java Function
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 10;
    }

    // Predicate Functional Interface
    static Predicate<String> strValidPredicate = phoneNum -> phoneNum.startsWith("07") && phoneNum.length() == 10;

    static Predicate<String> contains3 = phoneNum -> phoneNum.contains("3");
}
