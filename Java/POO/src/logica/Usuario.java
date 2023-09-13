
package logica;


public class Usuario {
    protected int folio;   //private los convierte en privados, y no será posible entrar de forma 
    protected String nombre;
    protected String apellido; //entrar desde la clase y clase heredadas

    public Usuario() {   //boton derecho insertar codigo, constructor, estamos generando el constructor vacio
    }

    public Usuario(int folio, String nombre, String apellido) {
        this.folio = folio;
        this.nombre = nombre;
        this.apellido = apellido;
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
    
    public void mostrarNombre(){
        System.out.println("Folio: " + this.folio + " Nombre: " + this.nombre + " Apellido: " + this.apellido);
    }
    
    public void ModificarNombre(){
        System.out.println("Quieres modificar algun dato?");
        
    }
}
