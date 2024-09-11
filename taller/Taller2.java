package taller;
import java.util.Scanner;

public class Taller2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de computadoras a comprar: ");
        int numComputadoras = scanner.nextInt();

        double precioComputadora = 500; 
        double totalCompra = numComputadoras * precioComputadora;

        double descuento = 0;
        if (numComputadoras < 5) {
            descuento = totalCompra * 0.10; 
        } else if (numComputadoras < 10) {
            descuento = totalCompra * 0.20; 
        } else {
            descuento = totalCompra * 0.40;
        }

        double totalAPagar = totalCompra - descuento;

        System.out.println("Total a pagar: $" + totalAPagar);
    }
}

// Desarrollado por Oscar Julian Ramirez Trujillo, codigo: 20241221201
