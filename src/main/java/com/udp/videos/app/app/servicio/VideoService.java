/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udp.videos.app.app.servicio;

import com.udp.videos.app.app.modelo.video.Video;
import com.udp.videos.app.app.modelo.video.VideoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Willy Laza Barrios
 */

@Service
public class VideoService {
    @Autowired
    private VideoRepository repository;
    
    /** Operacion listar todos los videos **/
    
    public List<Video> getVideo(){
        return repository.findAll();        
    }
    
    /** Operacion Guardar **/
    public Video saveVideo(Video video){
        return repository.save(video);
    }
    
    /** Operacion para mostrar por ID **/
    public Video getVideoById(int id){
        return repository.findById(id).orElse(null);
    }
    
    /** Operacion para Actualizar **/
    
    public Video updateVideo(Video video){
        Video existe=getVideoById(video.getId());
        existe.setNombreEvento(video.getNombreEvento());
        existe.setDescripcionVideo(video.getDescripcionVideo());
        existe.setDuracion(video.getDuracion());
        existe.setFecha(video.getFecha());
        existe.setUrlVideo(video.getUrlVideo());
        return repository.save(existe);
    }
    
    public void deleteVideo(int id){
        repository.deleteById(id);
       
    }
}
