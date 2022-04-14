public class App {
    public static void main(String[] args) throws Exception {
        // make a student, a teacher and a deptChief and show their info
        Student s = new Student("John", 20, "Doe", 123);
        Teacher t = new Teacher("Jane", 30, "Doe", 123);
        DeptChief dc = new DeptChief("Jack", 40, "Doe", 123, "IT");
        s.showType();
        s.showInfo();
        t.showType();
        t.showInfo();
        dc.showType();
        dc.showInfo();
    }
}
