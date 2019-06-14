package com.fedyr.code401.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String getSongs(Model m){
        Iterable<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "songs";
    }

}
