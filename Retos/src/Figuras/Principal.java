package Figuras;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        float base=0, altura=0;
        double radio=0;
        Scanner teclado=new Scanner(System.in);
        int Eleccion=1, rep=1;

        while (rep==1) {
            System.out.println("Elecciones: 1=Triangulo, 2=Rectangulo, 3=Circulo");
            Eleccion=teclado.nextInt();
            switch (Eleccion) {
                case 1:
                System.out.println("Digite la base del triangulo");
                base=teclado.nextFloat();
                System.out.println("Digite la altura del triangulo");
                altura=teclado.nextFloat();
                Triangulo t=new Triangulo(base, altura);
                t.calcularArea();
                    break;
                case 2:
                System.out.println("Digite la base del rectángulo");
                base=teclado.nextFloat();
                System.out.println("Digite la altura del rectángulo");
                altura=teclado.nextFloat();
                Rectangulo r=new Rectangulo(base, altura);
                r.calcularArea();
                    break;
                case 3:
                System.out.println("Digite el radio del circulo");
                radio=teclado.nextDouble();
                Circulo c=new Circulo(radio);
                c.calcularArea();
                    break;
                default:
                System.out.println("No esta en los numeros especificados");
                    break;
            }
            System.out.println("Quieres calcular otra Figura?: 1=Si, 2=No");
            rep=teclado.nextInt();
            if (rep==0){
                System.out.println("Gracias UwU");
            }
        }
        teclado.close();
    }
}