package JAVA101;

public class Main {
    public static void main(String[] args) {


        Teacher t1 = new Teacher("Recep İvedik", "MAT", "0101");
        Teacher t2 = new Teacher("Graham Bell","FZK","0000");
        Teacher t3 = new Teacher("Külyutmaz","BİO","1111");

        Course matematik = new Course("matematik","101","MAT");
        Course fizik = new Course("fizik","102","FZK");
        Course biyoloji = new Course("biyoloji","102","BİO");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);

        Student s1 = new Student("inek şaban","22","4",matematik,fizik,biyoloji);
        s1.addBulkExamNote(50,45,40);
        s1.addBulkOralNote(90,50,60);
        s1.isPass();

        Student s2 = new Student("güdük necmi","11","4",matematik,fizik,biyoloji);
        s2.addBulkExamNote(74,16,80);
        s2.addBulkOralNote(90,60,81);
        s2.isPass();

    }
}