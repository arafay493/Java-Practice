public class Student {
    String name;
    int age;

    //todo: apply final field
    final String GREETING = "Hello";
    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        //todo: cannot change the value of final field
        // this.GREETING = "Hi";  //todo: cannot change the value of final field
    }
    public static void main(String[] args) {
        Student student = new Student("John Doe", 25);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        //todo: cannot change the value of final field
        // student.GREETING = "Hi";  //todo: cannot change the value of final field
        System.out.println("Student Greeting: " + student.GREETING);
    }
}
