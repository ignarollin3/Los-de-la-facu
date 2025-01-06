

/*
Realizar un programa que permita convertir temperaturas en la escala Celsius a las escalas, Fahrenheit y Kelvin.
El programa deberá tener un menú que permita:
    1.	Ingresar/Modificar temperatura
    2.	Mostrar historial de temperaturas ingresadas
    3.	Mostrar temperatura en Celsius, Fahrenheit, Kelvin
    4.	Verificar si la temperatura es superior a un rango
    5.	Limpiar historial
    6.	Salir
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conversorEscalasTemp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        double tempCelsius = 0;
        String cHistTemp = "";

        do {
            System.out.println("\n╔════════════════════════════════════╗"); // 201 ╔ 205 ═ 187 ╗ 200 ╚ 188 ╝ 186 ║
            System.out.println("║   Menú de Conversor de Temperatura ║");
            System.out.println("╚════════════════════════════════════╝");
            System.out.println("1. Ingresar/Modificar temperatura");
            System.out.println("2. Mostrar historial de temperaturas ingresadas");
            System.out.println("3. Mostrar temperatura en Celsius, Fahrenheit, Kelvin");
            System.out.println("4. Verificar si la temperatura es superior a un rango");
            System.out.println("5. Limpiar historial");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(reader.readLine());

            switch (opcion) {
                case 1:
                    tempCelsius = ingresarTemp(reader);
                    cHistTemp += "\n" + tempCelsius;
                    System.out.println(tempCelsius);
                    break;

                case 2:
                    System.out.println("\nHistorial de temperaturas ingresadas: \n");
                    mostrarHistorial(cHistTemp);
                    break;

                case 3:
                    System.out.println("3. Mostrar temperatura en Celsius, Fahrenheit, Kelvin");
                    convertirTemperatura(tempCelsius);
                    break;

                case 4:
                    System.out.println("Verificar si la temperatura es superior a un rango");
                    rangoTemperatura(10,20, tempCelsius);
                    break;

                case 5:
                    System.out.println("Limpiar Historial");
                    cHistTemp = "Se reinicio el Historial";
                    System.out.println(cHistTemp);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    /*------------------------------------- */
    /* Metodo con retorno - ingre una temp */
    /*------------------------------------- */
    public static double ingresarTemp(BufferedReader ixt) throws IOException {
        System.out.print("Ingrese una temperatura en °Celsius: ");
        double temperatura = Double.parseDouble(ixt.readLine());
        return temperatura;

    }

    public static void mostrarHistorial(String historial) {
        if (historial.isEmpty())
            System.out.println("No se registran Temperaturas");
        else
            System.out.println("Las temperaturas ingresadas son: " + historial);

    }

    public static void convertirTemperatura(double tempC) {
        System.out.println("Conversión de temperatura");
        System.out.println("══════════════════════════");
        System.out.println("Temperatura en ºCelsius: " + tempC);
        System.out.println("Temperatura de Fahrenheit: " + celsiusAFahrenheit(tempC));
        System.out.println("Temperatura de Kelvin: " + celsiusAKelvin(tempC));
    }

    public static double celsiusAFahrenheit(double tempC) {
        return (tempC * 1.8) + 32;
    }

    public static double celsiusAKelvin(double tempC) {
        return tempC + 273.15;
    }

    public static void rangoTemperatura(double x, double y, double temp) {
        /* si son mayores a |y| -> "Alta Temp" */
        /* si son mayores a |x| menores o iguales a |y| -> "Temp Normal" */
        /* si son menores o iguales a |x| -> "Temp Baja" */

        if (temp > y) {
            System.out.println("Alta Temperatura");
        } else if (temp > x) {
            System.out.println("Temperatura Normal");
        } else {
            System.out.println("Baja Temperatura");
        }
    }


}
