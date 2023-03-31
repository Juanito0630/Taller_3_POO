package Juegos;
import java.util.Scanner;
import java.util.Random;
public class PPT implements Juego {
    private String nombreP1;
    private int seleccionComp, seleccionP1;
    Scanner teclado=new Scanner(System.in);

    public void iniciar() {
        System.out.println("Ingresa tu Nombre: ");
        nombreP1=teclado.next();
    }
    public void jugar() {
        System.out.print("¿Que elegiras? [1=Piedra, 2=Papel, 3=Tijera]: ");
        seleccionP1=teclado.nextInt();
        Random seleccion=new Random();
        seleccionComp=seleccion.nextInt(3)+1;
        System.out.println("La computadora ya jugo");
    }
    public void finalizar() {
        System.out.print("La computadora saco: ");

        switch ( seleccionComp )
        {
            case 1:
                System.out.println("Piedra");
                switch (seleccionP1)
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Ganaste!"); break;
                   case 3: System.out.println("La computadora Gana!"); break;
                }
                break;
            case 2:
                System.out.println("Papel");
                switch (seleccionP1)
                {
                   case 1: System.out.println("La computadora Gana!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Ganaste!"); break;
                }
                break;
            case 3:
                System.out.println("Tijera");
                switch (seleccionP1)
                {
                   case 1: System.out.println("Ganaste!"); break;
                   case 2: System.out.println("La computadora Gana!"); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
        }
    }
}