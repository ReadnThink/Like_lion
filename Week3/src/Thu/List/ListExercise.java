package Thu.List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    // new로 초기화를 하지 않고 값을 만지면 에러가 난다.
    // private  List<String> students = new ArrayList<>();
    List<String> students;

    public ListExercise(){
        // 생성자는
        this.students = new ArrayList<>();
        this.students.add("나");
        this.students.add("김미지");
        this.students.add("김미경");
        this.students.add("김경록");
    }

    public List<String> getStudents(){
        return this.students;
    }

}
