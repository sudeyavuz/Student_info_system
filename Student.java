package JAVA101;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    double total1;
    double total2;
    double total3;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
        this.total1=0;
        this.total2=0;
        this.total3=0;
    }
    public void addBulkExamNote(int note1,int note2,int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
    public void addBulkOralNote(int snote1,int snote2,int snote3){
        if (snote1 >= 0 && snote1 <= 100) {
            this.c1.snote = snote1;
        }
        if (snote2 >= 0 && snote2 <= 100) {
            this.c2.snote = snote2;
        }
        if (snote3 >= 0 && snote3 <= 100) {
            this.c3.snote = snote3;
        }
    }
    public void isPass(){
        this.total1 = (this.c1.note)*(0.80)+(this.c1.snote)*(0.20);
        this.total2 = (this.c2.note)*(0.60)+(this.c2.snote)*(0.40);
        this.total3 = (this.c3.note)*(0.70)+(this.c3.snote)*(0.30);
        this.average = (this.total1+this.total2+this.total3)/3.0;
        if (this.average>55){
            System.out.println("Sınıf Geçildi!");
            this.isPass=true;
        }else {
            System.out.println("Sınıfta Kalındı!");
            this.isPass=false;
        }
        printNote();
    }
    public void printNote(){
        System.out.println(this.c1.name+" notu:"+this.c1.note+", sözlü notu: "+c1.snote);
        System.out.println(this.c2.name+" notu:"+this.c2.note+", sözlü notu: "+c2.snote);
        System.out.println(this.c3.name+" notu:"+this.c3.note+", sözlü notu: "+ c3.snote);
        System.out.println("ortalamanız: "+this.average);
        System.out.println("--------------------------------");
    }

    }

