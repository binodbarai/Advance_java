package Unit11GUI.a.mvc;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-09
 **/
public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentAge(int age) {
        model.setAge(age);
    }


    public void render() {
        view.setDetails(model.getName(), model.getAge());
    }
}
