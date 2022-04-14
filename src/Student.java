//Student class extends Person class
public class Student extends Person {
    private int numInscrit;

    public Student(String firstName, int age, String lastName, int numInscrit) {
        super(firstName, age, lastName);
        this.numInscrit = numInscrit;
    }

    public Student() {
        super();
        this.numInscrit = 0;
    }

    @Override
    public void showType() {
        System.out.println("Student");
    }

    @Override
    public void showInfo() {
        System.out.println("Student: " + this.firstName + " " + this.lastName + " " + this.age + " " + this.numInscrit);
    }

}