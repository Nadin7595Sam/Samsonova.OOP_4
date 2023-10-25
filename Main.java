public class Main {
    public static void main(String[] args) {

        MathTeacher mathTeacher1 = new MathTeacher("Голлум");
        HistoryTeacher historyTeacher = new HistoryTeacher("Гэндальф");
        EnglishTeacher englishTeacher = new EnglishTeacher("Галадриэль");
        MathTeacher mathTeacher2 = new MathTeacher("Арагорн");

        TeacherGroup<MathTeacher> mathTeachers = new TeacherGroup<>();
        mathTeachers.addTeacher(mathTeacher1);
        mathTeachers.addTeacher(mathTeacher2);

        TeacherGroup<Teacher> humanitiesTeachers = new TeacherGroup<>();
        humanitiesTeachers.addTeacher(historyTeacher);
        humanitiesTeachers.addTeacher(englishTeacher);

        System.out.println();
        System.out.println("Уроки по естественным наукам:");
        mathTeachers.conductLessons();

        System.out.println("\nУроки по гуманитарным наукам:");
        humanitiesTeachers.conductLessons();
    }
}





