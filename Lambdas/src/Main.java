import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("Printing from Runnable")).start();

        Employee john = new Employee("John snow", 22);
        Employee tim = new Employee("Tim Buchalka", 33);
        Employee jack = new Employee("Jack Sparrow", 55);
        Employee snow = new Employee("Snow White", 44);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        Collections.sort(employees,(employee1, employee2)->(employee1.getName().compareTo(employee2.getName())));

        for(Employee employee : employees) {
            System.out.println(employee.getName());
        }

        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);
    }
    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}
class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the runnable");
    }
}
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}