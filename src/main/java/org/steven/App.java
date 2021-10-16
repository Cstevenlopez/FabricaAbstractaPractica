package org.steven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        CocheFactory coche;
        Motor motor;
        Carroceria carroceria;
        String carro;

        System.out.println("Selecciona una marca de vehículo:\n*Ford\n*Opel\n");
        carro = entrada.readLine().toLowerCase();

        if (carro.equals("ford")) {

            coche = new FordFocusFactory();

            motor = coche.crearMotor();
            System.out.println(motor.pmotor());

            carroceria = coche.crearCarroceria();
            System.out.println(carroceria.lcarroceria());

        }

        else if (carro.equals("opel")) {
            coche = new OpelAstraFactory();
            motor = coche.crearMotor();
            System.out.println(motor.pmotor());

            carroceria = coche.crearCarroceria();
            System.out.println(carroceria.lcarroceria());
        }

        else {
            System.out.println("El vehículo selecionado no se encuentra disponible");
            System.exit(0);
        }

    }

}