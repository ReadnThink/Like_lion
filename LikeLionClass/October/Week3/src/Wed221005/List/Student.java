package Wed221005.List;

public class Student {
    private int classNo;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNo, String name, String gitRepositoryAddress){
        this.name = name;
        this.classNo = classNo;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    @Override
    public String toString(){
        return (classNo + "반 " + name + "의  깃 주소 " + gitRepositoryAddress);
    }
}
