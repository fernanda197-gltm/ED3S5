import java.util.Scanner;

public class ejem8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] arreglo1 = new int[]{6, 7, 8, 9, 10};
        int[] arreglo2 = new int[5];
    
for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese 5 numeros para llenar el arreglo: ");
            int valor = teclado.nextInt();
            arreglo[i] = valor;
        }

           int i=0;
           while (true) {
            System.out.println("Ingrese 5  numeros para llenar el arreglo");
            
           }





        System.out.println("Ingrese 5 numeros para llenar el arreglo1: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese 5 numeros para llenar el arreglo1: ");
            valor = teclado.nextInt();
        }


System.out.println("Ingrese 5 numeros para llenar el arreglo2: ");
        valor = teclado.nextInt();
    }
}
