import java.util.Map;
import java.util.stream.Collectors;

public class MapFilterCollectExamples {
    public static void main(String[] args) {

        // 1: Online users
        Map<String, Boolean> users = Map.of(
                "Ana Silva", true,
                "Bruno Oliveira", false,
                "Carla Souza", true,
                "Diego Santos", false,
                "Elena Costa", true
        );

        Map<String, Boolean> onlineUsers = users.entrySet().stream()
                .filter(Map.Entry::getValue)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        // 2: Low stock products (quantity < 5)
        Map<String, Integer> stock = Map.of(
                "Mouse", 10,
                "Keyboard", 3,
                "Monitor", 2,
                "Phone", 8
        );

        Map<String, Integer> lowStockProducts = stock.entrySet().stream()
                .filter(product -> product.getValue() < 5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        // 3: Valid transactions
        Map<String, Double> transactions = Map.of(
                "t1", 1200.0,
                "t2", 450.0,
                "t3", 775.0,
                "t4", 500.0,
                "t5", 820.0
        );

        Map<String, Double> validTransactions = transactions.entrySet().stream()
                .filter(t -> t.getValue() > 500 && t.getValue() % 50 != 0)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        // 4: High score players (score >= 100, uppercase names)
        Map<String, Integer> scores = Map.of(
                "Lucas", 120,
                "Ana", 90,
                "Marcos", 150,
                "Bia", 70
        );

        Map<String, Integer> topPlayers = scores.entrySet().stream()
                .filter(score -> score.getValue() >= 100)
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toUpperCase(),
                        Map.Entry::getValue
                ));

        // 5: Orders above 200 and total revenue
        Map<Integer, Double> orders = Map.of(
                1, 150.0,
                2, 300.0,
                3, 90.0,
                4, 450.0,
                5, 210.0
        );

        double totalRevenue = orders.entrySet().stream()
                .filter(order -> order.getValue() > 200)
                .mapToDouble(Map.Entry::getValue)
                .sum();

        // 6: Active users (more than 10 actions)
        Map<String, Integer> activity = Map.of(
                "Joao", 5,
                "Maria", 18,
                "Ana", 12,
                "Pedro", 3
        );

        Map<String, Integer> activeUsers = activity.entrySet().stream()
                .filter(user -> user.getValue() > 10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }
}
