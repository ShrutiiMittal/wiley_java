package SerializationConcepts;
import java.io.Serializable;
public class Book implements Serializable{
    int bookCode;
    String bookName;

    public Book(int bookCode,String bookName){
        super();
        this.bookCode=bookCode;
        this.bookName= bookName;

    }
}
