package Exercise10;

public class Main {

    public static void main(String[] args) {

        Student student =
                new Student("Anushka",101,"A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(student,view);

        controller.showStudent();

        controller.updateStudent("Anushka","A+");

        controller.showStudent();

    }

}