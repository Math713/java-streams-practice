import java.util.List;

public class StudentGradeStatistics{
    public static void main(String[] args){

        List<Student> students = List.of(
                new Student("Computer Science", 8.5),
                new Student("Engineering", 6.8),
                new Student("Medicine", 9.2),
                new Student("Law", 7.4),
                new Student("Design", 5.9)
        );


        double max = students.stream().mapToDouble(Student::getGrade).max().orElseThrow();
        double avg = students.stream().mapToDouble(Student::getGrade).average().orElseThrow();
        long approved = students.stream().filter(x -> x.getGrade() >= 7).count();

        System.out.println("Highest grade: " + max);
        System.out.println("Average: " + avg);
        System.out.println("Quantity of approved: " + approved);
    }
}