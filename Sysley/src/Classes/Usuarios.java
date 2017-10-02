/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author rodri
 */
public class Usuarios {
    private String parlamentario; 
    private String[] asesores = new String[8]; 
    private String id; 
    
    public Usuarios(String parlamentario, String[] asesores,String id) {
        this.parlamentario = parlamentario;
        this.asesores = asesores; 
        this.id = id; 
    }

    public String getParlamentario() {
        return parlamentario;
    }

    public void setParlamentario(String parlamentario) {
        this.parlamentario = parlamentario;
    }

    public String[] getAsesores() {
        return asesores;
    }

    public void setAsesores(String[] asesores) {
        this.asesores = asesores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    //Codigo para creacion de Leyes
    
    
    
    
    
    
} // Clase Termina
