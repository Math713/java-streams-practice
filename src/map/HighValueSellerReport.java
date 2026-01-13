import java.util.Map;
import java.util.stream.Collectors;

public class HighValueSellerReport{
    public static void main(String[] args){
        Map<String, Double> sales = Map.of(
                "ana", 8500.0,
                "lucas", 12000.0,
                "maria", 15800.0,
                "joao", 4000.0,
                "pedro", 17000.0

        );

        Map<String,Double> result = sales.entrySet().stream()
                .filter(seller -> seller.getValue() > 10_000)
                .collect(Collectors.toMap(entry -> entry.getKey().toUpperCase()
                        , Map.Entry::getValue));


        System.out.println(result);
    }
}
