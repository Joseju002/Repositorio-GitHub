/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Jose", "Navarro", 1200, "12345678A");
        EmpleadoTemporal et1 = new EmpleadoTemporal("20-05-2024", "Pedro", "Jimenez", 1234.56, "87654321B");
        Gerente g1 = new Gerente(453, "Informatica", "Miguel", "Martinez", 1500, "11111111C");
        Directivo d1 = new Directivo(3728, 345, "Ingles", "Andres", "Giner", 1423.87, "22222222D");
        
        
        Empleado [] array = new Empleado[5];
        array[0]=e1;
        array[1]=e2;
        array[2]=et1;
        array[3]=g1;
        array[4]=d1;
        
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        et1.mostrarInformacion();
        g1.mostrarInformacion();
        d1.mostrarInformacion();
    }
    
}
