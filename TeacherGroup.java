import java.util.List;
import java.util.ArrayList;

class TeacherGroup<T extends Teacher> {
    private ArrayList<T> teachers = new ArrayList<>();

    public void addTeacher(T teacher) {
        teachers.add(teacher);
    }

    public void conductLessons() {
        for (T teacher : teachers) {
            teacher.teach();
        }
    }
}