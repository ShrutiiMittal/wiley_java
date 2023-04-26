package IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class AbstractStream {
    public static void main(String[] args) throws IOException {
        OutputStream fout=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\wiley_java\\Student_data.txt");
        String str="Wiley fullstack project";
        byte[]b =str.getBytes();
        fout.write(b);
        fout.flush();
        fout.close();

    }
}
