package guru.springframework.norris.chuck.controller;

import guru.springframework.norris.chuck.service.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {
    private final ChuckNorrisJokeService chuckNorrisJokeService;

    public ChuckNorrisController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping(path = "/")
    public String getChuckNorrisJoke(Model model) {
        model.addAttribute("joke", chuckNorrisJokeService.getJoke());

        return "joke/index";
    }

}
