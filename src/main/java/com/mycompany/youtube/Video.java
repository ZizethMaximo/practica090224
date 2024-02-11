/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author DELL 7490
 */
public class Video {
    public String titulo;
    public int duracionsegundos;
    public String url;

    public Video(String titulo, int duracionsegundos, String url) {
        this.titulo = titulo;
        this.duracionsegundos = duracionsegundos;
        this.url = url;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionsegundos() {
        return duracionsegundos;
    }

    public void setDuracionsegundos(int duracionsegundos) {
        this.duracionsegundos = duracionsegundos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
}
