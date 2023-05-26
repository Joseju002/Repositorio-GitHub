/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author usuario
 */
public class Directivo extends Gerente {
    
    private int comision;
    
    public Directivo(int comision, double bono, String departamento, String nombre, String apellido, double salario, String dni) {
        super(bono, departamento, nombre, apellido, salario, dni);
        this.comision = comision;
    }
    
    public Directivo(){
        super();
        comision = 0;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    
    

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Comision: " + this.comision);
    }
    
}
