package imperative;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.MALE;
import static imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Mohammad", MALE),
            new Person("Taku", FEMALE),
            new Person("Meepo", MALE),
            new Person("Sakura", FEMALE)
        );

        // Imperative Approach
        System.out.println("Imperative Approach");
        List<Person> Females = new ArrayList<>();

        for(Person person: people){
            if(person.gender == FEMALE)
                Females.add(person);
        }

        for(Person female: Females){
            System.out.println(female);
        }
        System.out.println();

        // Declarative Approach
        System.out.println("Declarative Approach");
        //One Line Solution1: System.out.println(people.stream().filter(person -> person.gender == FEMALE).collect(Collectors.toList()));
        //One Line Solution2: people.stream().filter(person -> FEMALE.equals(person.gender)).collect(Collectors.toList()).forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);  // predicate that returns a boolean value.
        people.stream().filter(personPredicate).collect(Collectors.toList()).forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}


