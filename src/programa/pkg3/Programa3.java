/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programa.pkg3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Programa3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        String respuesta = null;

        do {
            // Generar números binarios aleatorios
            String[] numerosBinarios = generarNumerosBinarios(rand);

            // Menú para elegir al mejor programador o al mejor ingeniero
            System.out.println("\nMenú:");
            System.out.println("1) Obtener al mejor Programador");
            System.out.println("2) Obtener al mejor Ingeniero");
            System.out.println("3) Salir");
            System.out.print("Seleccione una opción: ");
            int opcionMenu = leer.nextInt();

            switch (opcionMenu) {
                case 1:
                    // Calcular y mostrar al mejor programador
                    System.out.println("\nBinarios a decimales:");
                    double mejorProgramador = Double.MIN_VALUE;
                    int indiceMejorProgramador = -1;

                    for (int i = 0; i < 8; i++) {
                        int decimal = Integer.parseInt(numerosBinarios[i], 2);
                        double resultado = MejorProgramador(decimal);
                        System.out.println((i + 1) + ") " + resultado);

                        if (resultado > mejorProgramador) {
                            mejorProgramador = resultado;
                            indiceMejorProgramador = i;
                        }
                    }

                    System.out.println("\nEl mejor programador es el número " + (indiceMejorProgramador + 1));
                break;

                case 2:
                    // Calcular y mostrar al mejor ingeniero
                    System.out.println("\nBinarios a decimales:");
                    double mejorIngeniero = Double.MIN_VALUE;
                    int indiceMejorIngeniero = -1;

                    for (int i = 0; i < 8; i++) {
                        int decimal = Integer.parseInt(numerosBinarios[i], 2);
                        double resultado = MejorIngeniero(decimal);
                        System.out.println((i + 1) + ") " + resultado);

                        if (resultado > mejorIngeniero) {
                            mejorIngeniero = resultado;
                            indiceMejorIngeniero = i;
                        }
                    }

                    System.out.println("\nEl mejor ingeniero es el número " + (indiceMejorIngeniero + 1));
                break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    leer.close();
                    return;

                default:
                    System.out.println("Opción no válida. Selecciona 1, 2 o 3.");
                    continue;
            }

            System.out.print("\n¿Quieres crear una nueva generación? (si/no): ");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("si")) {
                
                // Cambiar aleatoriamente un valor binario
                int indiceCambio = rand.nextInt(8);
                StringBuilder binarioOriginal = new StringBuilder(numerosBinarios[indiceCambio]);

                // Copiar el valor original para mostrar la mutación
                StringBuilder binarioModificado = new StringBuilder(binarioOriginal);

                // Cambiar un bit aleatorio
                int indiceBitCambiado = rand.nextInt(9);
                char bitCambio = (binarioModificado.charAt(indiceBitCambiado) == '0') ? '1' : '0';
                binarioModificado.setCharAt(indiceBitCambiado, bitCambio);

                // Mostrar el cambio
                System.out.println("\nGeneración modificada:");
                System.out.println("Número " + (indiceCambio + 1) + ": " + binarioOriginal + " (antes de la mutación)");
                System.out.println("Número " + (indiceCambio + 1) + ": " + binarioModificado + " (después de la mutación)");
            
            
                // Formar parejas de números aleatorios entre 1 y 8 sin repetir
                System.out.println("\nParejas formadas:");
                Set<Integer> numerosEmparejados = new HashSet<>();

                for (int i = 0; i < 4; i++) {
                    int numero1 = obtenerNumeroSinRepetir(numerosEmparejados);
                    int numero2 = obtenerNumeroSinRepetir(numerosEmparejados);

                    System.out.println("Pareja " + (i + 1) + ": " + numero1 + " y " + numero2);

                    // Obtener el valor binario original
                    String binario1 = numerosBinarios[numero1 - 1];
                    String binario2 = numerosBinarios[numero2 - 1];

                    // Intercambiar los últimos tres dígitos
                    String nuevoBinario1 = binario1.substring(0, 6) + binario2.substring(6);
                    String nuevoBinario2 = binario2.substring(0, 6) + binario1.substring(6);

                    // Mostrar la nueva generación
                    System.out.println("Nueva generación:");
                    System.out.println("Número " + numero1 + ": " + nuevoBinario1);
                    System.out.println("Número " + numero2 + ": " + nuevoBinario2);
                    
                    }

                }

        } while (respuesta.equalsIgnoreCase("si"));  // Repetir el bucle si el usuario quiere crear otra generación

        // Cerrar el Scanner
        leer.close();
    }

     private static double MejorProgramador(double x) {
        return 6 * Math.pow(x, 2) + 3 * x - 6;
    }

    private static double MejorIngeniero(double x) {
        return -(Math.pow(x, 2) - 1) * (x - 35) * (x - 4);
    }
    
    private static int obtenerNumeroSinRepetir(Set<Integer> numerosEmparejados) {
        Random rand = new Random();
        int numero;
        do {
            numero = rand.nextInt(8) + 1;
        } while (!numerosEmparejados.add(numero));  // Intenta agregar el número al conjunto; repite si ya existe
        return numero;
    }

    private static String[] generarNumerosBinarios(Random rand) {
        String[] numerosBinarios = new String[8];
        for (int i = 0; i < 8; i++) {
            StringBuilder binario = new StringBuilder();
            for (int j = 0; j < 9; j++) {
                binario.append(rand.nextInt(2));
            }
            numerosBinarios[i] = binario.toString();
        }
        
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println(" ");
        System.out.println("Nueva Población:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Número " + (i + 1) + ": " + numerosBinarios[i]);
        }
        return numerosBinarios;
    }
}
