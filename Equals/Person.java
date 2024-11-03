package Equals;

public class Person {

    private String name;
    private int age;
    private String id;

    // getter/setter methods
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Constructors
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        // return this == o || (o instanceof Person);
        if (this == o) {
            return true;
        } else if (!(o instanceof Person)) {
            return false;
        } else if (getClass() != o.getClass()) {
            return false;
        } else if (getClass() == o.getClass()) {
            Person person = (Person) o;
            return person.name.equals(name) && person.age == age && person.id.equals(id);
            // return true;
        }
        return false;

        // return super.equals(o); 
        // if (!(o instanceof Person)) {
        //     return false;
        // }
        // Person person = (Person) o;
        // return person.name.equals(name) && person.age == age && person.id.equals(id);
    }

    // hashCode method
    // @Override
    // public int hashCode() {
    //     return Objects.hash(name, age, id);
    //     // return Objects.hash(name, age);
    //     // return Objects.hash(name);
    //     // return 0;
    // }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", id='" + id + '\''
                + '}';
    }

}
