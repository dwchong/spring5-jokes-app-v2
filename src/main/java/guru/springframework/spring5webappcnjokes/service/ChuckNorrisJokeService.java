package guru.springframework.norris.chuck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements GetJoke {
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    
    public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
//    public String getJoke() {
//        return "Hello, World!";
//    }
}
