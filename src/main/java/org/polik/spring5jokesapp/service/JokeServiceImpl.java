package org.polik.spring5jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Polik on 2/6/2022
 */
@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }
}
