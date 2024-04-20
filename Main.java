public class Main {
    public static void main(String[] args)
    {
        double[] grates = {1, 2.55, 3, 3.324};
        Student student = new Student(
                "fname",
                "lname",
                "s333",
                "test@d.d",
                "adf",
                grates);
        StudentGroup studentGroup = new StudentGroup("group");
        studentGroup.addStudentToGroup(student);
        double[] average = student.getAverageValue();
    }
}
