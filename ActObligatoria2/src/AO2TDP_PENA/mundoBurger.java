package AO2TDP_PENA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*“Mundo Burger” ofrece hamburguesas sencillas, dobles y triples, las cuales tienen un costo de
$3.500, $4.000 y $6.000 respectivamente. La empresa además del pago en efectivo, acepta tarjetas
de crédito con un cargo de 10 % sobre la compra. Suponiendo que los clientes adquieren sólo un tipo de hamburguesa, realizar un programa en Java para determinar cuánto debe pagar una persona por N hamburguesas*/

public class mundoBurger {
    public static void main(String[] args) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int numHam, tipoHam;
        float precio = 0, tarjeta, precioTotal = 0;

        do {
            System.out.println("╔══════════════════════════╗");
            System.out.println("║BIENVENIDO A MUNDO BURGUER║");
            System.out.println("╚══════════════════════════╝");
            System.out.println("Ingrese el numero de la hamburguesa que desee");
            System.out.println("1. Hamburguesa simple   - $3.500 ");
            System.out.println("2. Hamburguesa doble    - $4.000 ");
            System.out.println("3. Hamburguesa triples  - $6.000 ");
            System.out.println("4. Terminar pedido");

            tipoHam = Integer.parseInt(e.readLine());

            switch (tipoHam) {
                case 1:
                    precio = 3500;
                    break;

                case 2:
                    precio = 4000;
                    break;

                case 3:
                    precio = 6000;
                    break;

                case 4:
                    System.out.println("Terminando el pedido...");
                    ;
                    break;

                default:
                    System.out.println("Opcion inválida.");
                    break;

            }
        } while (tipoHam < 4);

        System.out.println("Cuantas hamburguesas desearia pedir?: ");
        numHam = Integer.parseInt(e.readLine());

        System.out.println("Su pedido sera abonado con tarjeta de credito? :\n1.SI\n2.NO");
        int credito = Integer.parseInt(e.readLine());

        if (credito == 1) {
            tarjeta = (float) (precio * 0.1) + precio;
            precioTotal = tarjeta * numHam;
        } else {
            precioTotal = precio * numHam;
        }

        System.out.println("PRECIO A PAGAR: " + precioTotal);

    }
}
