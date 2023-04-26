package IOstream;
import java.io.*;
public class CharacterStreamClass {
    public static void main(String[] args) throws IOException{
        Writer out=new OutputStreamWriter(System.out);
        Writer fw=new FileWriter("C:\\Users\\lenovo\\Desktop\\wiley_java\\data.txt");
        BufferedWriter bw= new BufferedWriter(fw);

        bw.write("I like programming");
        bw.flush();;
        bw.close();
        fw.close();
    }
}
//byte stream vs char stream ,applications
/*byte stream- read / write binary data
 * -input/output 8 bits
 * - buffered(input/output) reduce I/O operations in os level calls
 * -data(input/output) stream machine independant byte order
 * -file(i/o) stream byte-oriented data(stream of raw bytes)
 * 
 * 
 * char stream 
 * - characters-tezt data
 * -i/o operations of 16 bit unicode char streams
 * 
*/