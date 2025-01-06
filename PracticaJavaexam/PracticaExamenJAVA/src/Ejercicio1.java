import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;

/*Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la semana (5 días) y requiere 
determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas. Escribir un programa en Java 
con Visual Studio Code para determinar la cantidad de horas en total y el sueldo a percibir teniendo en cuenta que si 
supera la cantidad de horas supera las 40 horas percibirá un 20% más del sueldo.*/


public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));

        double masCuarenta;
        double sueldoTotal;
        System.out.println("Ingrese la cantidad de horas a la semana (Habiles):");
        int horas = Integer.parseInt(e.readLine());
        int cantHoras = horas * 4;
        System.out.println("Ingrese el valor monetario de la hora trabajada: ");
        int sueldo = Integer.parseInt(e.readLine());

        if (cantHoras>=40) {
            masCuarenta=(sueldo*0.20)+sueldo;
            sueldoTotal = masCuarenta*cantHoras;
        }
        else {
            sueldoTotal = cantHoras*sueldo;
        }

        System.out.println("Su el total de su sueldo es "+ sueldoTotal + " y sus horas acumuladas en el mes son: "+ cantHoras );
    }
}
