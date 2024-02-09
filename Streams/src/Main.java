import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50",
                "I26", "I17", "I29",
                "O71"
        );
        someBingoNumbers.forEach(number -> {
            if (number.startsWith("G")) {
                System.out.println(number);
            }
        });
        someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter((s -> s.startsWith("G")))
                .sorted().forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-----------------------");
        System.out.println(concatStream.distinct().peek(System.out::println).count());

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

//        List<String> sortedGnumbwes = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s->s.startsWith("G"))
//                .collect(Collectors.toList());
        List<String> sortedGnumbwes = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        sortedGnumbwes.forEach(s -> System.out.println(s));

        someBingoNumbers.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}