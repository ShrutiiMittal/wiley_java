package IOstream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.*;
public class BOStream {
    public static void main(String[] args) throws FileNotFoundException ,IOException{
    //     FileOutputStream fout=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\wiley_java\\data.txt");
    //     BufferedOutputStream bof=new BufferedOutputStream(fout); //if we write system.out instead of fout then it will be printed in the terminal 
    // String str="I am a Programmer";
    // byte[]b = str.getBytes();
    // try{
    //     bof.write(b);
    //     bof.flush();//flush is for discarding the data
    //     bof.close();//for closing the buffered reader connection
    // }
    // catch(IOException e){
    //         e.printStackTrace();
    // }
    
        FileInputStream fin=new FileInputStream("C:\\Users\\lenovo\\Desktop\\wiley_java\\data.txt");
        BufferedInputStream bis=new BufferedInputStream(fin);
        int i;
        // try{
        while((i=bis.read())!=-1){
            System.out.println((char)i);
        }
    // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }
        bis.close();
        fin.close();

    }
    
}

// Buffered is for bytes
//datastream for primtive data types
// byte stream n chr stream hierarchy xplain