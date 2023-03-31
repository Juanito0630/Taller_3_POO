package Figuras;
public class Circulo extends Principal {
    //atributos
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void calcularArea(){
        double area;
        area=3.14*(radio*radio);
        System.out.println("El radio del circulo es: "+radio+" y su area es de: "+area); {
        }
    }
}
