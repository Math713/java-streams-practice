
public class Student {

    private String course;
    private double grade;

    public Student(String course, double grade) {
        this.course = course;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "(" + course + ") - Grade: " + grade;
    }
}

