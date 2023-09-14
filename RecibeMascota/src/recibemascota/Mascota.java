/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recibemascota;

/**
 *
 * @author PILARES
 */
public class Mascota {
    
    //atributos
    private String NombrePerro;
    private int edad;
    private String raza;
    private double tamaño;
    private String NombreDueño;
        
//metodos
//metodo constructor
    public Mascota(String NombrePerro, int edad, String raza, double tamaño, String NombreDueño) {
        this.NombrePerro = NombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamaño = tamaño;
        this.NombreDueño = NombreDueño;
    }

    //metosos getter y setters
    public String getNombrePerro() {
        return NombrePerro;
    }

    public void setNombrePerro(String NombrePerro) {
        this.NombrePerro = NombrePerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }
    //mis metodos
}
