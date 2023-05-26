/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author usuario
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private double salario;
    private String dni;
    
    //Constructores
    
    public Empleado(){
        nombre="";
        apellido="";
        salario=0;
        dni="";
    }

    public Empleado(String nombre, String apellido, double salario, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.dni = dni;
    }
    
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Metodos
    
    public void mostrarInformacion(){
        System.out.println("Informacion de empleado");
        System.out.println("-----------------------");
        System.out.println("Nombre y apellido: " + this.nombre + " " + this.apellido);
        System.out.println("DNI: " + this.dni);
        System.out.println("Salario: " + this.salario + "€");
    }
    
}
