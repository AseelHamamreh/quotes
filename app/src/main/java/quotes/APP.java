package quotes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;


public class APP {
    public static void main(String[] args) throws FileNotFoundException {

//        reading the JSON file:
        FileReader reader = new FileReader("D:\\JAVA\\labs\\quotes\\app\\src\\main\\java\\quotes\\recentqoutes.json");

//        change the file type from array:
        Type collectionType = new TypeToken<List<Books>>(){}.getType();
        List<Books> myBooks = new Gson().fromJson( reader , collectionType);

//        generate a random number inside the list size:
        int randomNum = (int) (Math.random() * ((myBooks.size()) + 1));

//        print results:
        System.out.println("Book Name: "+ myBooks.get(randomNum).getAuthor());
        System.out.println("Book Quote: " +myBooks.get(randomNum).getText());
    }
}
