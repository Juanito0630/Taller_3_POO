package Figuras;
public class Rectangulo extends Principal {
        //atributos
        float base, altura;

        public Rectangulo(float base, float altura) {
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
        area=base*altura;
        System.out.println("la altura del rectangulo es: "+altura+" su base es: "+base+" y su área es: "+area);
    }     
}
    

