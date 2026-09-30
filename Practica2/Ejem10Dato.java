import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejem10Dato{
    String nombre;
    int edad;
    String correo;
    
    public Ejem10Dato(String nombre, int edad, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    public Ejem10Dato(){}
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setEdad(int edad){ this.edad = edad; }
    public void setCorreo(String correo){ this.correo = correo; }
    public String getNombre(){ return nombre; }
    public int getEdad(){ return edad; }
    public String getCorreo(){ return correo; }

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Ejem10Dato> lista = new ArrayList<>();

        System.out.print("¿Cuantos usuarios deseas capturar? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Usuario " + (i+1) + ":");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            
            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            teclado.nextLine();
            
            System.out.print("Correo: ");
            String correo = teclado.nextLine();

            lista.add(new Ejem10Dato(nombre, edad, correo));
        }

        System.out.println("\n--- USUARIOS CAPTURADOS ---");
        for (Ejem10Dato dato : lista) {
            System.out.println("Nombre: " + dato.getNombre());
            System.out.println("Edad: " + dato.getEdad());
            System.out.println("Correo: " + dato.getCorreo());
            System.out.println("-------------------------");
        }
    }
}