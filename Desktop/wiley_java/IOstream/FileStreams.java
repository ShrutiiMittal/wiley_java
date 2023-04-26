package IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileStreams {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\wiley_java\\Student_data.txt");
        String str="Wiley fullstack project";
        byte[]b =str.getBytes();
        fout.write(b);
        fout.flush();
        fout.close();


        FileInputStream fin=new FileInputStream("C:\\Users\\lenovo\\Desktop\\wiley_java\\Student_data.txt");
        int i=0;
        while((i=fin.read())!=-1){
            System.out.println((char)i);
        }
        
        fin.close();
        }
}
