/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author usuario
 */
public class Gerente extends Empleado{
    
    private double bono;
    private String departamento;

    public Gerente(double bono, String departamento, String nombre, String apellido, double salario, String dni) {
        super(nombre, apellido, salario, dni);
        this.bono = bono;
        this.departamento = departamento;
    }
    
    public Gerente(){
        super();
        bono = 0;
        departamento = "";
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Bono: " + this.bono);
        System.out.println("Departamento: " + this.departamento);
    }
    
    
    
    
    
}
