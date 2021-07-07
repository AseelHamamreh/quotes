package quotes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;

public class APP {
    public static void main(String[] args) throws IOException {

//        JSON file:

//        reading the JSON file:
        FileReader reader = new FileReader("D:\\JAVA\\labs\\quotes\\app\\src\\main\\java\\quotes\\recentqoutes.json");

//        change the file type from array:
        Type collectionType = new TypeToken<List<Books>>(){}.getType();
        List<Books> myBooks = new Gson().fromJson( reader , collectionType);

//        generate a random number inside the list size:
        Random random = new Random();
        int randomNum = random.nextInt((myBooks.size() - 1) + 1);


//        for API:

        String url = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();

        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStreamReader inputStreamReader = new InputStreamReader(con.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String data = bufferedReader.readLine();
            bufferedReader.close();

            Gson gson = new Gson();
            Quotes myQuote = gson.fromJson(data, Quotes.class);

//        printing API  data:

            System.out.println("Results from API: ");
            System.out.println("Book Author: " + myQuote.getQuoteAuthor());
            System.out.println("Book Quote: " + myQuote.getQuoteText());
        }

        else {
//        printing JSON file data:

        System.out.println("Results from JSON file: ");
        System.out.println("Book Author: "+ myBooks.get(randomNum).getAuthor());
        System.out.println("Book Quote: " +myBooks.get(randomNum).getText());
        }
    }

}