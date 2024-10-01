public class Course {
    static int maxCapacity;
    String courseName;
    int enrolledStudents;
    static {
        maxCapacity = 0;
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        if(enrolledStudents < maxCapacity){
            enrolledStudents++;
            System.out.println(studentName + " Enrolled...");
        }else{
            System.out.println("Course capacity reached.");
        }
    }

    void unEnrollStudent(String studentName){
        if(enrolledStudents > 0){
            enrolledStudents--;
            System.out.println(studentName + " Unenrolled...");
        }else{
            System.out.println("No students enrolled.");
        }
    }


    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setMaxCapacity(2);
        course1.enrollStudent("Izhan");
        course1.enrollStudent("Ali");
        course1.enrollStudent("Ammar");
        course1.unEnrollStudent("Ali");
    }
}
