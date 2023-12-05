package programa.pkg3;

import java.util.Scanner;



public class Programa3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        String x1,x2,x3,x4,x5,x6,x7,x8;
        
        System.out.println("Ingresa el numero 1:");
        x1 = leer.nextLine();
        System.out.println("Ingresa el numero 2");
        x2 = leer.nextLine();
        System.out.println("Ingresa el numero 3");
        x3 = leer.nextLine();
        System.out.println("Ingresa el numero 4");
        x4 = leer.nextLine();
        System.out.println("Ingresa el numero 5");
        x5 = leer.nextLine();
        System.out.println("Ingresa el numero 6");
        x6 = leer.nextLine();
        System.out.println("Ingresa el numero 7");
        x7 = leer.nextLine();
        System.out.println("Ingresa el numero 8");
        x8 = leer.nextLine();

        if(x1.length() == 9 && x2.length() == 9 && x3.length() == 9 && x4.length() == 9 && x5.length() == 9 && x6.length() == 9 && x7.length() == 9 && x8.length() == 9){
            if(Binario(x1)&&Binario(x2)&&Binario(x3)&&Binario(x4)&&Binario(x5)&&Binario(x6)&&Binario(x7)&&Binario(x8)){
                double decimal = Integer.parseInt(x1,2);
                double decimal2 = Integer.parseInt(x2,2);
                double decimal3 = Integer.parseInt(x3,2);
                double decimal4 = Integer.parseInt(x4,2);
                double decimal5 = Integer.parseInt(x5,2);
                double decimal6 = Integer.parseInt(x6,2);
                double decimal7 = Integer.parseInt(x7,2);
                double decimal8 = Integer.parseInt(x8,2);
                
                System.out.println("1) "+x1+" --> "+decimal);
                System.out.println("2) "+x2+" --> "+decimal2);
                System.out.println("3) "+x3+" --> "+decimal3);
                System.out.println("4) "+x4+" --> "+decimal4);
                System.out.println("5) "+x5+" --> "+decimal5);
                System.out.println("6) "+x6+" --> "+decimal6);
                System.out.println("7) "+x7+" --> "+decimal7);
                System.out.println("8) "+x8+" --> "+decimal8);
                
                int op;
                System.out.println("\nEncontrar al...");
                System.out.println("Mejor Programador (1)");
                System.out.println("Mejor Ingeniero (2)");
                op = leer.nextInt();
                
                switch (op) {
                    case 1 -> {
                        double rx1P = MejorProgramador(decimal);
                        double rx2P = MejorProgramador(decimal2);
                        double rx3P = MejorProgramador(decimal3);
                        double rx4P = MejorProgramador(decimal4);
                        double rx5P = MejorProgramador(decimal5);
                        double rx6P = MejorProgramador(decimal6);
                        double rx7P = MejorProgramador(decimal7);
                        double rx8P = MejorProgramador(decimal8);
                        System.out.println("\nEl mejor programador:\n");
                        
                        System.out.println("1) "+x1+" --> "+rx1P);
                        System.out.println("2) "+x2+" --> "+rx2P);
                        System.out.println("3) "+x3+" --> "+rx3P);
                        System.out.println("4) "+x4+" --> "+rx4P);
                        System.out.println("5) "+x5+" --> "+rx5P);
                        System.out.println("6) "+x6+" --> "+rx6P);
                        System.out.println("7) "+x7+" --> "+rx7P);
                        System.out.println("8) "+x8+" --> "+rx8P);
                        
                        String[] numeros = new String[8];
                        numeros[0]=x1;
                        numeros[1]=x2;
                        numeros[2]=x3;
                        numeros[3]=x4;
                        numeros[4]=x5;
                        numeros[5]=x6;
                        numeros[6]=x7;
                        numeros[7]=x8;
                        
                        System.out.println("Ingrese como desea agrupar los numeros: ");
                        leer.nextLine();
                        String agrupacion = leer.nextLine();
                        String[] pares = agrupacion.split("\\s+");

                        System.out.println("\n¿Cuantos numeros de derecha a izquierda quieres cambiar? (solo se puede del 1-8)");
                        int sustituto = leer.nextInt();

                        if (pares.length % 2 == 0) {

                            for (int i = 0; i < pares.length; i += 2) {
                                int primerNumero = Integer.parseInt(pares[i]);
                                int segundoNumero = Integer.parseInt(pares[i + 1]);
                                System.out.println("Par agrupado: " + numeros[primerNumero-1] + ", " + numeros[segundoNumero-1]+"\n");

                                if(sustituto<=8){
                                    String parteDerechaCadena1 = numeros[primerNumero-1].substring(numeros[primerNumero-1].length() - sustituto);
                                    String parteDerechaCadena2 = numeros[segundoNumero-1].substring(numeros[segundoNumero-1].length() - sustituto);

                                    // Intercambiar los tres últimos caracteres entre las dos cadenas
                                    String nuevaCadena1 = numeros[primerNumero-1].substring(0, numeros[primerNumero-1].length() - sustituto) + parteDerechaCadena2;
                                    String nuevaCadena2 = numeros[segundoNumero-1].substring(0, numeros[segundoNumero-1].length() - sustituto) + parteDerechaCadena1;

                                    // Mostrar el resultado
                                    System.out.println("\nResultado de la nueva poblacion:");
                                    System.out.println("Nueva cadena 1: " + nuevaCadena1);
                                    System.out.println("Nueva cadena 2: " + nuevaCadena2);
                                    System.out.println("\n");
                                }else{
                                    System.out.println("El sustituto solo puede ser del 1 - 8");
                                }

                            }
                            
                            
                            
                        } else {
                            System.out.println("Entrada inválida. Debe ingresar una cantidad par de números.");
                        }
                    }
                    case 2 -> {
                        double rx1I = MejorIngeniero(decimal);
                        double rx2I = MejorIngeniero(decimal2);
                        double rx3I = MejorIngeniero(decimal3);
                        double rx4I = MejorIngeniero(decimal4);
                        double rx5I = MejorIngeniero(decimal5);
                        double rx6I = MejorIngeniero(decimal6);
                        double rx7I = MejorIngeniero(decimal7);
                        double rx8I = MejorIngeniero(decimal8);
                        System.out.println("\nEl mejor ingeniero:\n");
                        
                        System.out.println("1) "+x1+" --> "+rx1I);
                        System.out.println("2) "+x2+" --> "+rx2I);
                        System.out.println("3) "+x3+" --> "+rx3I);
                        System.out.println("4) "+x4+" --> "+rx4I);
                        System.out.println("5) "+x5+" --> "+rx5I);
                        System.out.println("6) "+x6+" --> "+rx6I);
                        System.out.println("7) "+x7+" --> "+rx7I);
                        System.out.println("8) "+x8+" --> "+rx8I);

                        String[] numeros = new String[8];
                        numeros[0]=x1;
                        numeros[1]=x2;
                        numeros[2]=x3;
                        numeros[3]=x4;
                        numeros[4]=x5;
                        numeros[5]=x6;
                        numeros[6]=x7;
                        numeros[7]=x8;
                        
                        System.out.println("Ingrese como desea agrupar los numeros (por ejemplo, '1 2', '3 4'): ");
                        leer.nextLine();
                        String agrupacion = leer.nextLine();
                        String[] pares = agrupacion.split("\\s+");

                        System.out.println("\n¿Cuantos numeros de derecha a izquierda quieres cambiar? (solo se puede del 1-8)");
                        int sustituto = leer.nextInt();
                        
                        if (pares.length % 2 == 0) {
                            for (int i = 0; i < pares.length; i += 2) {
                                int primerNumero = Integer.parseInt(pares[i]);
                                int segundoNumero = Integer.parseInt(pares[i + 1]);
                                System.out.println("Par: " + numeros[primerNumero-1] + ", " + numeros[segundoNumero-1]);
                                if(sustituto<=8){
                                    String parteDerechaCadena1 = numeros[primerNumero-1].substring(numeros[primerNumero-1].length() - sustituto);
                                    String parteDerechaCadena2 = numeros[segundoNumero-1].substring(numeros[segundoNumero-1].length() - sustituto);

                                    // Intercambiar los tres últimos caracteres entre las dos cadenas
                                    String nuevaCadena1 = numeros[primerNumero-1].substring(0, numeros[primerNumero-1].length() - sustituto) + parteDerechaCadena2;
                                    String nuevaCadena2 = numeros[segundoNumero-1].substring(0, numeros[segundoNumero-1].length() - sustituto) + parteDerechaCadena1;

                                    // Mostrar el resultado
                                    System.out.println("\nResultado de la nueva poblacion:");
                                    System.out.println("Nueva cadena 1: " + nuevaCadena1);
                                    System.out.println("Nueva cadena 2: " + nuevaCadena2);
                                    System.out.println("\n");
                                }else{
                                    System.out.println("El sustituto solo puede ser del 1-8");
                                }

                            }
                        } else {
                            System.out.println("Entrada inválida. Debe ingresar una cantidad par de números.");
                        }
                    }
                    default -> System.out.println("Solo se puede elegir entre 1 (mejor programador) o 2 (mejor ingeniero)");
                }
                
            }else{
                System.out.println("Cada numero debe ser binario");
            }
        }else{
            System.out.println("Cada numero debe tener 9 digitos exactamente");
        }        
    }
    private static boolean Binario(String str){
        return str.matches("[01]+");
    }
    private static double MejorProgramador(double x){
        return -6*Math.pow(x, 2) + 3*x - 6;
    }
    private static double MejorIngeniero(double x){
        return -(Math.pow(x, 2)-1) * (x-35) * (x-4);
    }
}
