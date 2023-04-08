/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author USER
 */
public class empleado {
    
    private String nombre;
    private int edad;
    private String departamento;
    
    public empleado(
            String nombre, int edad, 
            String departamento){
        
           this.nombre = nombre;
          this.edad = edad;
           this.departamento = departamento; 
    }
    
    
    public static empleado  copiaEmpleado(empleado empleado01d){
        
       return new empleado (
       
               empleado01d.getNombre(),
               empleado01d.getEdad(),
               empleado01d.getDepartamento()
       );   
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
     public  String getTextoImprimir(){
        
        return "Nombre: " 
                + this.nombre  
                + "\nEdad: " 
                +getEdadComoTexto()
                + "\nDed: "
                +this.departamento
                + "\n--------------";
        
    }
    
    public String getEdadComoTexto(){
        
        String edadTexto = String.valueOf(edad);  
        return edadTexto;
        
    }
 

    
}