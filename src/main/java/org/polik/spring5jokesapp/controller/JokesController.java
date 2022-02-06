package org.polik.spring5jokesapp.controller;

import org.polik.spring5jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Polik on 2/6/2022
 */
@Controller
public class JokesController {
    private final JokeService service;

    public JokesController(JokeService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showJoke(Model model) {
        model.addAttribute("joke", service.getRandomJoke());

        return "index";
    }
}
