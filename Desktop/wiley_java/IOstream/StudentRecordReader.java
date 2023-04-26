package IOstream;
import java.util.*;
import java.io.*;
public class StudentRecordReader {
    static DataInputStream dataInput;
    public StudentRecordReader(String inputFile)throws FileNotFoundException{
        dataInput=new DataInputStream(new FileInputStream(inputFile));

    }
    public List<Student> readAll()throws IOException{
        List<Student> listStudent =new ArrayList<>();
        try{
            while(true){
                String name=dataInput.readUTF();
                char gender =dataInput.readChar();
                int age=dataInput.readInt();
                float grade=dataInput.readFloat();
                Student student=new Student(name,gender,age,grade);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return listStudent;
    }
    public static void main(String[] args) throws IOException {
        String inputFile="C:\\Users\\lenovo\\Desktop\\wiley_java\\Student_data.txt";
        try{
            StudentRecordReader reader=new StudentRecordReader(inputFile);
            List<Student> listOfStudents=reader.readAll();
            for(Student student : listOfStudents){
                System.out.println(student.getName()+"\t");
                System.out.println(student.getGender()+"\t");
                System.out.println(student.getAge()+"\t");
                System.out.println(student.getMarks());
            }
        }
            catch(Exception ex){
                ex.printStackTrace();
            }

            dataInput.close();
        }
    
}
