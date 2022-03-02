/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udp.videos.app.app.modelo.video;

import com.udp.videos.app.app.modelo.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Willy Laza Barrios
 */

/** Interface para operaciones CRUD la tabla video **/
public interface VideoRepository extends JpaRepository<Video,Integer> {
    
}
