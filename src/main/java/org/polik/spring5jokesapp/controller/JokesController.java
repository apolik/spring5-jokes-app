package org.polik.spring5jokesapp.controller;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

/**
 * Created by Polik on 2/6/2022
 */
@Controller
public class JokesController {
    private ChuckNorrisQuotes quotes;

    @GetMapping("/")
    public String showJoke(Model model) {
        model.addAttribute("joke", quotes.getRandomQuote());

        return "index";
    }

    @PostConstruct
    private void init() {
        this.quotes = new ChuckNorrisQuotes();
    }
}
