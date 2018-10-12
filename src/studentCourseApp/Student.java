package studentCourseApp;

public class Student {
    private String firsName;
    private String lastName;
    private String email;
    private int studentId;

    public String getCourseTaking() {
        return courseTaking;
    }

    public void setCourseTaking(String courseTaking) {
        this.courseTaking = courseTaking;
    }

    private String courseTaking;


    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
