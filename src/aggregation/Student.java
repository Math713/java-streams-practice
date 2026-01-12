public class Student {
    private String course;
    private Double grade;

    public Student(String course, Double grade) {
        this.course = course;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "(" + course + ") - Grade: " + grade;
    }
}
