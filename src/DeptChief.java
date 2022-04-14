//DeptChief extends Teacher and has a department
public class DeptChief extends Teacher {
    private String department;

    public DeptChief(String firstName, int age, String lastName, int cnss, String department) {
        super(firstName, age, lastName, cnss);
        this.department = department;
    }

    public DeptChief() {
        super();
        this.department = "";
    }

    @Override
    public void showType() {
        System.out.println("DeptChief");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Department: " + this.department);
    }
}
