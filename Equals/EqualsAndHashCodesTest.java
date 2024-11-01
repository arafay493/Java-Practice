package Equals;

public class EqualsAndHashCodesTest {

    public static void main(String[] args) {
        Person person1 = new Person("Izhan", 25, "p-1");
        Person person2 = new Person("Izhan", 25, "p-1");

        // if(person1 == person2){
        //     System.out.println("Both person1 and person2 are the same object");
        // }else{
        //     System.out.println("Both person1 and person2 are not the same object");
        // }
        if (person1.equals(person2)) {
            System.out.println("Both person1 and person2 are the same object");
        } else {
            System.out.println("Both person1 and person2 are not the same object");
        }
    }
}
