//Person is an abstract class that defines the basic attributes of a person.
//It also defines the methods that are common to all people.

public abstract class Person {
    protected String firstName;
    protected int age;
    protected String lastName;

    // Constructor
    public Person(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    // Constructor without parameters
    public Person() {
        this.firstName = "";
        this.age = 0;
        this.lastName = "";
    }

    // showType abstract method
    public abstract void showType();

    // showRInfo abstract method
    public abstract void showInfo();
}