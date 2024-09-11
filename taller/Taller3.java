package taller;
import java.util.Scanner;

public class Taller3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de nacimientos: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        int CuentaDeMasculino = 0;
        int CuentaDeFemenino = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingresa el nombre del bebé: ");
            String nombre = scanner.nextLine();

            char sexo;
            do {
                System.out.print("Ingresa el sexo del bebé (Masculino = M / Femenino = F): ");
                sexo = scanner.nextLine().toUpperCase().charAt(0);

                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo no válido. Debe ser M (masculino) o F (femenino).");
                }
            } while (sexo != 'M' && sexo != 'F');

            if (sexo == 'M') {
                CuentaDeMasculino++;
            } else if (sexo == 'F') {
                CuentaDeFemenino++;
            }
        }

        System.out.println("Cantidad de bebés masculinos: " + CuentaDeMasculino);
        System.out.println("Cantidad de bebés femeninos: " + CuentaDeFemenino);
    }
}


// Desarrollado por Oscar Julian Ramirez Trujillo, codigo: 20241221201