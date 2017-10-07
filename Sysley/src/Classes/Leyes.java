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
    private int cantLeyes = 5; 
    private int cantReglamentos = 5;    
    
      
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
    
   public int getCantLeyes() {
        return cantLeyes;
    }

   public void setCantLeyes(int cantLeyes) {
        this.cantLeyes = cantLeyes;
    }

   public int getCantReglamentos() {
        return cantReglamentos;
    }

   public void setCantReglamentos(int cantReglamentos) {
        this.cantReglamentos = cantReglamentos;
    }  
   
   public boolean prestamoLey() {
    int cantDisponibles = getCantLeyes();
       
    if (cantDisponibles > 0) {
        cantDisponibles--; 
         setCantLeyes(cantDisponibles); 
        return true; 
    }
    else 
        return false; 
   } 
   
   public boolean devolverLey() {
       int cantDisponibles = getCantLeyes();    
       if (cantDisponibles > 6) {
           return false; 
       }
       else { 
         cantDisponibles++; 
        setCantLeyes(cantDisponibles);
        return true; 
       }
   } 
   
   public boolean prestamoReglamento() {
    int cantDisponibles = getCantReglamentos();
       
    if (cantDisponibles > 0) {
        cantDisponibles--; 
        setCantReglamentos(cantDisponibles);
        return true; 
    }
    else 
        return false; 
   }
   
      public boolean devolverReglamento() {
       int cantDisponibles = getCantReglamentos();     
        if (cantDisponibles > 6) {
            return false; 
        }
        else {
         cantDisponibles++; 
        setCantReglamentos(cantDisponibles); 
        return true; 
        }
   } 
   
    public boolean prestamoLote() {
    int cantDisponiblesL = getCantLeyes();
    int cantDisponiblesR = getCantReglamentos();   
    if ( (cantDisponiblesL > 0) && (cantDisponiblesR>0) ) {
        cantDisponiblesL--; 
        cantDisponiblesR--; 
        setCantLeyes(cantDisponiblesL); 
        setCantReglamentos(cantDisponiblesR); 
        return true; 
    }
    else 
        return false; 
   }
    
    public boolean devolverLote() {
    int cantDisponiblesL = getCantLeyes();
    int cantDisponiblesR = getCantReglamentos(); 
        if ( (cantDisponiblesL > 6) && (cantDisponiblesR > 6) ) {
        return false; 
        }
        else {
        cantDisponiblesL++; 
        cantDisponiblesR++; 
        setCantLeyes(cantDisponiblesL); 
        setCantReglamentos(cantDisponiblesR);  
                return true; 
         }
    }  
    
}//TERMINA CLASE LEYES
    
