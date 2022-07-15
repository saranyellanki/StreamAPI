package streams;

import java.util.List;

public class Employee {

    private int empId;
    private String name;
    private Double salary;
    private List<String> projects;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

    public Employee(int empId, String name, Double salary, List<String> projects) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.projects = projects;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }
}
