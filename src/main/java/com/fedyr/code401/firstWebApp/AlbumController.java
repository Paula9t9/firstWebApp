package com.fedyr.code401.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

//    @PostMapping("/newAlbum")
//    public ResponseEntity<?> addAlbums(@RequestParam("name") String name){
//        Album album = new Album(name);
//        albumRepository.save(album);
//        return new ResponseEntity<>(album, HttpStatus.OK);
//    }

    @GetMapping("/newAlbum")
    public String albumForm(Model model) {
        model.addAttribute("album", new Album());
        return "album_form";
    }

    @PostMapping("/newAlbum")
    public String albumSubmit(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "albums";
    }


}
