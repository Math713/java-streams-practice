import java.util.ArrayList;
import java.util.List;

public class FilterAndUppercaseNames{
    public static void main(String[] args){

        List<String> listNames = new ArrayList<>(List.of(
                "Matheus",
                "Lucas",
                "Maria",
                "Ana",
                "João"));

        listNames.stream().filter(name -> name.length() >= 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
