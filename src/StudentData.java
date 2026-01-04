import java.util.ArrayList;

public class StudentData {

    public static ArrayList<Student> getStudents() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ringo", "Starr", 2.50));   // earns 0.00
        students.add(new Student("Paul", "McCartney", 3.10)); // earns 36660.00

        return students;
    }
}
