/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Usuario
 */
public class Usuario_menor extends Usuario {
    String tutor;

    public Usuario_menor() {
    }

    public Usuario_menor(String tutor, int folio, String nombre, String apellido) {
        super(folio, nombre, apellido);
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

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
    
    //polimorfismo
        public void mostrarNombre(){   //método para mostrar los datos camelCase
        System.out.println("Folio: " + this.folio + " Nombre: " + this.nombre + " Apellido: " + this.apellido + " Tutor: " + this.tutor);
    }
    
}
