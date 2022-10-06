package Thu.List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    // new로 초기화를 하지 않고 값을 만지면 에러가 난다.
    // private  List<String> students = new ArrayList<>();

    List<String> students; //위 주석처리한것처럼 초기화를 바로하지 않으면 생성자에서 해줘야한다.

    public ListExercise(){
        // 생성자는 객체가 생성될때 가장먼저 실행되니 생성자에서 new로 초기화 해줘도 된다.
        // 생성자 오버라이드가되면 안될거 같다...
        this.students = new ArrayList<>();
        this.students.add("나");
        this.students.add("김미지");
        this.students.add("김미경");
        this.students.add("김경록");
        this.students.add("나는 창의적이야");
        this.students.add("나는 뭐든 배울 수 있어");
    }

    public List<String> getStudents(){
        return this.students;
    }

}
