import java.util.HashMap;
import java.util.Map;

public class StudentsAboveSeven {
    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();

        students.put("Ana", new Student("Medicine", 8.0));
        students.put("Joao", new Student("Engineering", 6.5));
        students.put("Maria", new Student("Law", 9.2));
        students.put("Lucas", new Student("Computer Science", 7.5));

        students.entrySet().stream()
                .filter(entry -> entry.getValue().getGrade() >= 7)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
