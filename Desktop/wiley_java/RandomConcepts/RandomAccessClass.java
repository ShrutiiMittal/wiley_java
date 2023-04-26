package RandomConcepts;
import java.io.*;
public class RandomAccessClass {
    public static void main(String[] args) {
        try{
            RandomAccessFile file=new RandomAccessFile("TestFile.txt","rw");
            file.writeBytes("Hello, Wiley!");

            //read data back from the file
            file.seek(0);
            byte[] bytes=new byte[13];
            file.read(bytes);
            String data=new String(bytes);

            System.out.println(data);

            //write some more data to the file
            file.seek(7);
            file.writeBytes("Jaava");
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
