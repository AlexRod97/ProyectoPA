/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Felipe
 */
public class Leyes {
    
    public String nombreLey;
    public String reglamentoLey;
    private String id;

   // public String IndexName[] = new String[50];

   
    public Leyes(String Ley, String Descripcion) { // CONSTRUCTOR
        this.nombreLey = Ley;
        this.reglamentoLey = Descripcion;        
    }
    
    
    public String getLey(){
        return this.nombreLey;
    }
    public String getDescripcion(){
        return this.reglamentoLey;
    }
     public String getID(){
        return this.id;
    }
    
    
    public void setLey(String Ley){
        this.nombreLey = Ley;
    }
    public void setDescripcion(String Descripcion){
        this.reglamentoLey = Descripcion;
    }
    public void setID(String id){
        this.id = id;
    }
    
    
}//TERMINA CLASE LEYES
    
