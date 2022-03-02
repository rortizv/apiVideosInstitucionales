/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udp.videos.app.app.modelo.video;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Willy Laza Barrios
 */
/**Clase entidad de la tabla Video**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="video")
public class Video {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreEvento")
    private String nombreEvento;
    @Column(name="descripcionVideo")
    private String descripcionVideo;
    @Column(name="duracion")
    private String duracion;
    @Column(name="fecha")
    private String fecha;
    @Column(name="urlVideo")
    private String urlVideo;
    
    public void ID (int id) {
        this.id = id;
    }
}

