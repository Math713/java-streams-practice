import java.util.Map;
import java.util.stream.Collectors;

public class SuspiciousTransactionsFilter{
    public static void main(String[] args){
        Map<String, Double> transactions = Map.of(
                "TX1001", 1000.0,
                "TX1002", 1050.0,
                "TX1003", 1325.75,
                "TX1004", 2000.0,
                "TX1005", 1875.30
        );

        Map<String,Double> suspiciousTransactions = transactions.entrySet().stream()
                .filter(x -> x.getValue() > 1_000 && x.getValue() % 10 != 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Suspect accounts:");
        suspiciousTransactions.forEach(
                (id,value) -> System.out.println(id + " -> " + value));
    }
}
