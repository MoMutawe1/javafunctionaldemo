package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        System.out.println("// Normal Java Function call");
        Customer customerObj = new Customer("Meepo", "079 999 799");
        greetCustomer(customerObj);

        System.out.println("// Consumer Functional Interface call");
        greetCustomerConsumer.accept(customerObj);

        System.out.println("// BiConsumer Functional Interface call");
        greetCustomerBiConsumer.accept(customerObj,false);
    }

    // Normal Java Function
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.name + " ,Thanks for registering phone number: " + customer.phoneNumber);
    }

    // Consumer Functional Interface
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.name + " ,Thanks for registering phone number: " + customer.phoneNumber);

    // BiConsumer Functional Interface
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.name +
            " ,Thanks for registering phone number: " + (showPhoneNumber ? customer.phoneNumber : "*****"));

    static class Customer{
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}

