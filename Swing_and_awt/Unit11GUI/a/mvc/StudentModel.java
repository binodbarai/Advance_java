package Unit11GUI.a.mvc;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-09
 **/
public class StudentModel {
    private String name;
    private int age;

    public StudentModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentModel() {

    }

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
}
