package sec04.exam10;

public class Student {
    public int StudentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.StudentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode(){
        return StudentNum;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        if(StudentNum != student.StudentNum) return false;
        return true;
    }
}
