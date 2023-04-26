package SerializationConcepts;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableObject {
    public static void main(String[] args) {
        try{
            FileInputStream fin= new FileInputStream("books.ser");
            ObjectInputStream ois=new ObjectInputStream(fin);

            Book b=(Book) ois.readObject();
            System.out.println("Book code: "+ b.bookCode);
            System.out.println("Book name: "+ b.bookName);
            ois.close();


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
