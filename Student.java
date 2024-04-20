import java.util.stream.DoubleStream;
import java.text.DecimalFormat;

public class Student {
    String fname;
    String lname;
    String indexNumber;
    String email;
    String address;
    double[] grates;

    public Student(
            String fname,
            String lname,
            String indexNumber,
            String email,
            String address,
            double[] grates
            ) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        if (grates.length > 20) {
            throw new IllegalStateException("Student cannot have more than 20 grates");
        }
        this.grates = grates;
    }

    public double[] getAverageValue() {
        double[] averageGrates = new double[this.grates.length];

        for (int i = 0; i < this.grates.length; i++) {
            if (this.grates[i] < 2.5) {
                averageGrates[i] = 2;
            } else if (this.grates[i] < 3) {
                averageGrates[i] = 2.5;
            } else if (this.grates[i] < 3.5) {
                averageGrates[i] = 3;
            } else if (this.grates[i] < 4) {
                averageGrates[i] = 3.5;
            } else if (this.grates[i] < 4.5) {
                averageGrates[i] = 4;
            } else if (this.grates[i] < 5) {
                averageGrates[i] = 4.5;
            } else if (this.grates[i] == 5) {
                averageGrates[i] = 5;
            }
        }
        return averageGrates;
    }
}
