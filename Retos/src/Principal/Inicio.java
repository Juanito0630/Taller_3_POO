package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        double peso, estatura, total=0, valorhora, horas;
        String cargo="", departamento="";
        String nombre, apellido, tipodoc;
        int numdoc=0;

        Scanner Recibir=new Scanner(System.in);
        Persona persona=new Persona();
        Empleado empleado=new Empleado(cargo, departamento, numdoc, numdoc);

        /*System.out.println("Nombre: ");
        nombre=Recibir.next();
        System.out.println("Apellido: ");
        apellido=Recibir.next();
        System.out.println("Tipo Documento: ");
        tipodoc=Recibir.next();
        System.out.println("Num. Documento: ");
        numdoc=Recibir.nextInt();
       
        empleado.dataEmpleado();
        empleado.calcularHonorarios();*/

        System.out.println("Ingresa tu peso: ");
        peso=Recibir.nextDouble();
        System.out.println("Ingresa tu estatura: ");
        estatura=Recibir.nextDouble();

        persona.pedirDatos();
        persona.mostrarpersona();
        persona.calcularIMC(peso, estatura);

        Recibir.close();
    }
}
