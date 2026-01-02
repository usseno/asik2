import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Employee", 27045.78));
        people.add(new Employee2("George", "Harrison", "Employee 2", 50000.00));

        people.add(new Student("Ringo", "Starr", 2.50));          // no stipend
        people.add(new ScholarStudent("Paul", "McCartney", 3.10)); // stipend

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }
}

