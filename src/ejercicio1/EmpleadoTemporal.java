/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author usuario
 */
public class EmpleadoTemporal extends Empleado{
    
    private String fechaFinalContrato;

    public EmpleadoTemporal(String fechaFinalContrato, String nombre, String apellido, double salario, String dni) {
        super(nombre, apellido, salario, dni);
        this.fechaFinalContrato = fechaFinalContrato;
    }
    
    public EmpleadoTemporal(){
        super();
        fechaFinalContrato = "";
    }

    public String getFechaFinalContrato() {
        return fechaFinalContrato;
    }

    public void setFechaFinalContrato(String fechaFinalContrato) {
        this.fechaFinalContrato = fechaFinalContrato;
    }
    
    
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Fecha final del contrato: " + this.fechaFinalContrato);
    }
    
}
