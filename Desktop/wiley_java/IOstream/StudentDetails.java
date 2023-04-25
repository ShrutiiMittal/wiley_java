package IOstream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class StudentDetails {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileOutputStream fout=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\wiley_java\\Student_data.txt");
        DataOutputStream dos=new DataOutputStream(fout);
        
        // ArrayList<Student> arr=new ArrayList<>();
        Student s1=new Student("abc", 'M', 22, 90.2f);
        Student s2=new Student("def", 'F', 23, 98.1f);
        Student s3=new Student("ghi", 'F', 21, 99.0f);
        Student s4=new Student("jkl", 'M', 27, 79.5f);
        
        write(s1,dos);
        write(s2,dos);
        write(s3,dos);
        // for(int i=0;i<4;i++)    
        // dos.writeBytes("Name:"+s1.getName()+"\ngender:"+s1.getGender()+"\nage:"+s1.getAge()+ "\ngrade:"+ s1.getMarks());
        dos.flush();
        dos.close();
        
    }
    public static void write(Student s,DataOutputStream dos)throws IOException{
        dos.writeUTF("\nName:"+ s.getName());
        dos.writeBytes("\nGender:"+s.getGender());
        dos.writeBytes("\nAge:"+s.getAge());
        dos.writeBytes("\nMarks:"+s.getMarks());

    }
    
}
class Student{
    private String name;
    private char gender;
    private int age;
    private float marks;
    public Student(String name, char gender,int age,float marks){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.marks=marks;
    }
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public float getMarks() {
        return marks;
    }
   

}


// sir's github repo link: https://github.com/srmono/wiley_java
// https://github.com/srmono/wiley_java/tree/master/wiley_core_java/src/IOStream