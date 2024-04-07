import java.util.HashSet;

public class StudentGroup {
    String nazwa;
    HashSet<Student> students = new HashSet<Student>();


    public StudentGroup(
            String nazwa
    ) {
        this.nazwa = nazwa;
    }

    public void addStudentToGroup(Student student) {
        if (this.students.size() >= 15) {
            throw new IllegalStateException("You cannot add more than 15 students to a group");
        }
        if (this.students.contains(student)) {
            throw new IllegalStateException("Student already in group");
        }
        this.students.add(student);
    }
}

