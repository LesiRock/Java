/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Usuario
 */
public class Usuario_estado extends Usuario{ //extends para herencia
   String municipio;
    
    public Usuario_estado() {
    }

    public Usuario_estado(String municipio, int folio, String nombre, String apellido) {
        super(folio, nombre, apellido);
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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
        System.out.println("Folio: " + this.folio + " Nombre: " + this.nombre + " Apellido: " + this.apellido + " Municipio: " + this.municipio);
    }
    
    
}
