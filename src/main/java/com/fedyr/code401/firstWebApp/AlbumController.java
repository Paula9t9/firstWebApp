package com.fedyr.code401.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    // Album names pulled from Album name generator: https://www.fantasynamegenerators.com/album-names.php
    @GetMapping("/albums")
    public String getAlbums(Model m){
        String[] albumTitles = new String[]{"Crime of the century\n" +
                "Grains of sand\n" +
                "Rocket surgery\n" +
                "Glass shoe\n" +
                "Game on\n" +
                "Elephant in the room\n" +
                "Knowledge bomb\n" +
                "Nine yards\n" +
                "Dinner for one\n" +
                "Crowd control"};
        m.addAttribute("albumTitles", albumTitles);
        return "albums";
    }
}
