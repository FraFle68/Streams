import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100));
        }

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        numbers.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

        System.out.println(numbers);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);

        Integer sum = numbers.stream()
                        .reduce(0, Integer::sum);

        System.out.println(sum);

        // Bonusaufgabe
        try {
            List<Student> students =
                Files.lines(Path.of("students.csv"))
                        .skip(1)
                        .filter(line -> !line.isEmpty())
                        .distinct()
                        .map(line -> line.split(","))
                        .map(line -> new Student(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3])))
                        .toList();
            System.out.println(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
