package com.fedyr.code401.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAlbums(Model m){
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }

    @GetMapping("/newAlbum")
    public String albumForm(Model model) {
        model.addAttribute("album", new Album());
        return "album_form";
    }

    @PostMapping("/newAlbum")
    public String albumSubmit(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "result";
    }

    @GetMapping("/album_details/{id}")
    public String getAlbumDetails(@PathVariable Long id, Model m){
        Album album = albumRepository.findById(id).get();
        m.addAttribute(album);
        return "album_details";
    }


}
