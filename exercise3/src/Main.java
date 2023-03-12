import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        // Using forEach() method with lambda expression to iterate over List
        features.forEach(feature -> System.out.println(feature));

    }
}