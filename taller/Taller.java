package taller;
import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el número de horas que trabajó el obrero: ");
        int horastrabajadas = scanner.nextInt();
        double salario;
        
        if (horastrabajadas<=40) {
            salario = horastrabajadas * 5000;
        } else {
            salario = 40 * 5000;
            int horasextras = horastrabajadas - 40;
            double aumento = horasextras * 5000 * 1.20;
            salario += aumento;
        }
       
        System.out.println("El salario del obrero es de: " + salario);
          
        }
    }
    

// Desarrollado por Oscar Julian Ramirez Trujillo, codigo: 20241221201
