package com.example.Employee;

class Employee {

    private String name;
    private int age;
    private int Salary;

    // Constructors
    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.Salary = salary;
    }

    void getEmployeeDetails() {
        System.out.println(
                "Employee Details:\n"
                + "Name: " + name
                + ", Age: " + age
                + ", Salary: " + Salary + "\n"
                + "---------------------------------\n"
        );
        // return "Name: " + name + ", Age: " + age + ", Salary: " + Salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }
}
