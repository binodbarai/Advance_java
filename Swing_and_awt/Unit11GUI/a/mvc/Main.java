/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-09
 **/
public class Main {
    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentModel, studentView);

        studentController.setStudentName("Ram");
        studentController.setStudentAge(20);

        studentController.render();
    }
}
