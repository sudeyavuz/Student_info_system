package JAVA101;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int snote;
    Teacher teacher;
    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else {
            System.out.println("öğretmen ve ders bölümleri uyuşmamaktadır.");
        }

    }
    void printTeacher(){
        this.teacher.print();
    }

}
