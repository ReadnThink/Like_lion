package Wed221005.List;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<Student> students = likeLion2th.getStudentList();

        for (Student student: students) {
            System.out.println(student);
        }


        System.out.println(students.size());
    }
}
