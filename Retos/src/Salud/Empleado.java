package Salud;
import java.util.Scanner;
public class Empleado extends Persona {
    private String cargo, departamento;
    private int horas, valorhora;

    public Empleado(String cargo, String departamento, int horas, int valorhora) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.horas = horas;
        this.valorhora = valorhora;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getValorhora() {
        return valorhora;
    }
    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public void datosEmpleado(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Cargo del Empleado: ");
        cargo=teclado.next();
        System.out.println("Departamento del Empleado: ");
        departamento=teclado.next();
        System.out.println("Horas Trabajadas: ");
        horas=teclado.nextInt();
        System.out.println("Valor por Hora: ");
        valorhora=teclado.nextInt();
        teclado.close();
    }

    public void calcularHonorarios() {
        double reteica;
        double total=0;
        total=valorhora*horas;
        reteica=(0.966*total);
        total=(total-reteica);
        System.out.println("Los Honorarios del Empleado son: "+total);
    }
}