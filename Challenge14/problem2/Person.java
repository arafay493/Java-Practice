package Challenge14.problem2;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return person.name.equals(name) && person.age == age;
    }

    // @Override
    // public int hashCode() {
    //     int result = name != null ? name.hashCode() : 0;
    //     result = 31 * result + age;
    //     return result;
    // }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
