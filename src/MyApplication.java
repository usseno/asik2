import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        for (Employee e : EmployeeData.getEmployees())
            people.add(e);

        for (Student s : StudentData.getStudents())
            people.add(s);


        Collections.sort(people);


        printData(people);
    }


    public static void printData(Iterable<Person> people) {

        for (Person p : people) {
            System.out.printf("%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }
}

