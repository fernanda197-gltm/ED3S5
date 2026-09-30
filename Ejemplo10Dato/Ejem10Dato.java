package Ejemplo10Dato; 
public class Ejem10Dato{
    String nombre;
    int edad;
    String correo;
    
    // Constructor con parametros
    public Ejem10Dato(String nombre, int edad, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
        
    // Constructor vacio
    public Ejem10Dato(){
    }

    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    // Getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCorreo(){
        return correo;
    }
}