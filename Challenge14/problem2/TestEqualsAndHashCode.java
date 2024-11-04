package Challenge14.problem2;

public class TestEqualsAndHashCode {

    public static void main(String[] args) {
        Person person1 = new Person("Izhan", 25);
        Person person2 = new Person("Izhan", 25);
        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
// Print the hash codes
        System.out.println("Hash code of person1: " + person1.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());
    }
}
