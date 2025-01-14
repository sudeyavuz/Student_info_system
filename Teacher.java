package JAVA101;

public class Teacher {
    String name;
    String phonenum;
    String branch;

    Teacher(String name,String branch,String phonenum){
        this.name = name;
        this.branch = branch;
        this.phonenum = phonenum;

    }
    void print(){
        System.out.println("adı : "+this.name);
        System.out.println("branşı : "+this.branch);
        System.out.println("tel no. : "+this.phonenum);

    }
}
