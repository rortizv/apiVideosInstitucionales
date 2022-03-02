/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udp.videos.app.app.controlador;

import com.udp.videos.app.app.modelo.video.Video;
import com.udp.videos.app.app.servicio.VideoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Willy Laza Barrios
 */

@RestController
@RequestMapping("/api/video")
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class VideoController {
    
    @Autowired
    private VideoService service;
    
    @GetMapping("/all")
    public List<Video> findAllVideos(){
        return service.getVideo();
    }
    
    @GetMapping("/{id}")
    public Video findVideoId(@PathVariable int id){
        return service.getVideoById(id);
    }
    
    @PostMapping("/save")
    public ResponseEntity addVideo(@RequestBody Video video){
        service.saveVideo(video);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity editarVideo(@RequestBody Video video, @PathVariable int id){
        video.ID(id);
        service.updateVideo(video);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteVideoId(@PathVariable int id){
        service.deleteVideo(id);
        return ResponseEntity.status(204).build();
    }
    
}
