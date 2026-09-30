//uso de memoria estatica.
public class Ejem7 {
    private int contador = 0;
public static int contadorEstatico = 0;

public ejem6
contador=1;

    public int getContador() {
        return contador;
    }

    public static void incrementarContadorEstatico() {
        contadorEstatico++;
    }

    public static int getContadorEstatico() {
        return contadorEstatico;
    }

    public static void main(String[] args) {
        Ejem7 obj1 = new Ejem7();
        Ejem7 obj2 = new Ejem7();

        System.out.println("Contador de obj1: " + obj1.getContador());
        System.out.println("Contador de obj2: " + obj2.getContador());
        Ejem7.incrementarContadorEstatico();
        System.out.println("Contador estatico: " + Ejem7.getContadorEstatico());
    }
}
private int contador=
private int con






public void incrementarContador() {
        contador++;
    }

  public int getContador() {
        return contador;
    }

    public static void incrementarContadorEstatico() {
        contadorEstatico++;
    }
    public static int getContadorEstatico() {
        return contadorEstatico;
    }
       public static void main(String[] args) {
           ejem7 obj1 = new Ejem7();
           ejem7 obj2 = new Ejem7();

           System.out.println("Contador de obj1: " + obj1.getContador());
           System.out.println("Contador de obj2: " + obj2.getContador());
           ejem7.incrementarContadorEstatico();
       }