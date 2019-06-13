package com.fedyr.code401.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    // Album names pulled from Album name generator: https://www.fantasynamegenerators.com/album-names.php
    @GetMapping("/albums")
    public String getAlbums(Model m){
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }
}
