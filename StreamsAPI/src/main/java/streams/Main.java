package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<Employee> employees = new ArrayList<Employee>();

    static {
        employees.add(new Employee(1,"Saran",4.0,List.of("Project 1", "Project 2")));

        employees.add(new Employee(2,"Santhan",10.0,List.of("Project 3", "Project 4")));

        employees.add(new Employee(3,"Madhukar",6.0,List.of("Project 5", "Project 6")));
    }


    public static void main(String[] args) {

        //for each
        employees.stream()
                .forEach(employee -> System.out.println(employee));

        // map
        // collect
        List<Employee> increasedSal = employees.stream()
                .map(employee -> new Employee(
                        employee.getEmpId(),
                        employee.getName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .collect(Collectors.toList());
        increasedSal.stream()
                .forEach(employee -> System.out.println(employee));

        //filter
        employees.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .map(employee -> new Employee(
                        employee.getEmpId(),
                        employee.getName(),
                        employee.getSalary() * 1.50,
                        employee.getProjects()
                ))
                .forEach(employee -> System.out.println(employee));
        Double sal = employees.stream()
                .map(employee -> employee.getSalary())
                .reduce(1.0,(partial,total) -> partial*total);

        System.out.println(sal);
    }
}
