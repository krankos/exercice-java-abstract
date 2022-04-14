//Teacher extends Person
public class Teacher extends Person {
    protected int cnss;

    // constructor
    public Teacher(String firstName, int age, String lastName, int cnss) {
        super(firstName, age, lastName);
        this.cnss = cnss;
    }

    // constructor without parameters
    public Teacher() {
        super();
        this.cnss = 0;
    }

    // showType method
    @Override
    public void showType() {
        System.out.println("Teacher");
    }

    // showInfo method
    @Override
    public void showInfo() {
        System.out.println("Teacher: " + this.firstName + " " + this.lastName + " " + this.age + " " + this.cnss);
    }

}
