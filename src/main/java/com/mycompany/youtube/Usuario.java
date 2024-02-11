/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author DELL 7490
 */
public class Usuario {
    public String nombre;
    public Video videosubido;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Video getVideosubido() {
        return videosubido;
    }

    public void subirVideo(Video videosubido) {
        this.videosubido = videosubido;
    }
    
    public void mostrarInfoUsuario(){
        System.out.println("Usuario" + nombre);
        if(videosubido !=null ){
            System.out.println("Ultimo video subido" +videosubido.getTitulo());
        }else{
            System.out.println("Aun no se han subido videos");
        }
                
    }
}
