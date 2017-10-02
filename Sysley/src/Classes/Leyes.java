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
    
    public String NombreLey;
    public String ReglamentoLey;
    private String id;

   // public String IndexName[] = new String[50];

   
    public Leyes(String Ley, String Descripcion, String id) { // CONSTRUCTOR
        this.NombreLey = Ley;
        this.ReglamentoLey = Descripcion;
        this.id = id;
    }
    
    
    public String GetLey(){
        return this.NombreLey;
    }
    public String GetDescripcion(){
        return this.ReglamentoLey;
    }
     public String GetID(){
        return this.id;
    }
    
    
    public void SetLey(String Ley){
        this.NombreLey = Ley;
    }
    public void SetDescripcion(String Descripcion){
        this.ReglamentoLey = Descripcion;
    }
    public void SetID(String id){
        this.id = id;
    }
    
    
}//TERMINA CLASE LEYES
    
