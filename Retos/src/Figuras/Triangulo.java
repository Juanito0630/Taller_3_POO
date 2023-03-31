package Figuras;
public class Triangulo extends Principal{
    //atributos
    float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea(){
    float area;
    area=(base*altura)/2;
    System.out.println("La base del triangulo es: "+base+" su altura es: "+altura+" y su area es de: "+area); {
    }
}
}