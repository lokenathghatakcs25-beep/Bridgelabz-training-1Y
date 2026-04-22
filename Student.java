
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections; // Added this import
public class Student {
    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    String name;
    int id;
    int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public static void main(String[] args) {
        List<Student> l1 = Arrays.asList(
                new Student("lokenath", 123, 34),
                new Student("aman", 123, 34),
                new Student("amio", 78, 90)
        );
        Collections.sort(l1, (Student a, Student b) -> a.id - b.id);

        System.out.println("list of Student" + l1);
    }
}