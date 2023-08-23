package com.tenxrs.springjokesweb.controllers;

import com.tenxrs.springjokesweb.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckJokesController {

    private final JokesService jokesService;

    public ChuckJokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("")
    public String getJoke(Model model) {

        model.addAttribute("joke", jokesService.getRandomJoke());

        return "index";
    }
}
