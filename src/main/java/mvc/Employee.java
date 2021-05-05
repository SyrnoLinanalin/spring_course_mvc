package mvc;

import mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2, message = "name must be min 2 symbols")
    private  String name;
    @NotBlank(message = "surname ob9zon")
    private String surname;

    private  String department;

    private  String carBrend;
    @Min(value = 500, message = "must be greather then 499")
    @Max(value = 1000, message = "less when 1000")
    private int salary;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "need abc.com")
    private String email;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String[] languages;

    private Map<String, String> departments;

    private Map<String, String> carBrends;

    private Map<String, String> list;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getCarBrends() {
        return carBrends;
    }

    public void setCarBrends(Map<String, String> carBrends) {
        this.carBrends = carBrends;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
        departments = new HashMap<String, String>();
        departments.put("IT","Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrends = new HashMap<String, String>();
        carBrends.put("BMW","BMW");
        carBrends.put("AUDI", "Audi");
        carBrends.put("MB", "Mersedec-Benz");

        list = new HashMap<String, String>();
        list.put("English", "ENG");
        list.put("Dolch","GER");
        list.put("Franch", "FRC");
    }

    public Map<String, String> getList() {
        return list;
    }

    public void setList(Map<String, String> list) {
        this.list = list;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
