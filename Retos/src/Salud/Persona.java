package Salud;
import java.util.Scanner;
public class Persona {
    private String tipoDoc, nombre, apellido, sexo;
    private int doc, edad;
    private double estatura, peso;

    public void pedirDatos() {
        Scanner Capturar=new Scanner(System.in);

        System.out.println("Ingresa tu tipo de documento: ");
        tipoDoc=Capturar.next();
        System.out.println("Ingresa tu numero de documento: ");
        doc=Capturar.nextInt();
        System.out.println("Ingresa tu nombre: ");
        nombre=Capturar.next();
        System.out.println("Ingresa tu apellido: ");
        apellido=Capturar.next();
        System.out.println("Ingresa tu peso: ");
        peso=Capturar.nextDouble();
        System.out.println("Ingresa tu estatura: ");
        estatura=Capturar.nextDouble();
        System.out.println("Ingresa tu edad: ");
        edad=Capturar.nextInt();
        System.out.println("Ingrese tu sexo: ");
        sexo=Capturar.next();
    
    Capturar.close();
    }

    public void mostrarpersona() {
        System.out.println("Tipo de Documento: "+tipoDoc);
        System.out.println("Numero de Documento: "+doc);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        /*System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);*/
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
    }
    
    public double calcularIMC(double peso, double estatura) {
        double pesoAct;
        pesoAct=peso/(estatura*estatura);
        System.out.println("Su peso actual es de: "+pesoAct);
        if (pesoAct<20){
            System.out.println("El peso está por debajo de lo ideal");
            }else if (pesoAct>20 || pesoAct<25){
            System.out.println("El peso es el ideal");
            }else if (pesoAct>25){
            System.out.println("Usted esta en Sobrepeso");
        }
        return pesoAct;
    }
}