/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author DELL 7490
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario usuario= new Usuario(" Maximo");
        Video video= new Video(" aprendiendo Java",2400,"http://martinezmaximo.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
        Usuario usuario2=new Usuario("Max");
        Comentario comment1=new Comentario("ta chido", usuario2);
        System.out.println(" El usuario"+ usuario2.getNombre()+comment1.getContenido());
                        
    }
}
