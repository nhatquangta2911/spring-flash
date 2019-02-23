package ryan;

public class Student {

    private String studentName;
    private float score;
    private Class className;

    public Student(String studentName, float score, Class className) {
        this.studentName = studentName;
        this.score = score;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", score=" + score +
                ", className=" + className.getClassName() +
                '}';
    }
}
