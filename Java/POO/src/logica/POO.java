
package logica;

import java.util.Scanner;

public class POO {

  
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario(); //uso el constructor sin datos
        Usuario usuario2 = new Usuario (1,"david","santillan");
      
        
        //System.out.println(usuario2.nombre); //NO seria lo ideal por seguridad, va directo
        System.out.println(usuario2.getNombre()); //ES o correcto va al método no al origen
        usuario2.mostrarNombre();  //va al get, no directo
        
        usuario1.setFolio(2);  //usando el constructor vacio
        usuario1.setNombre("Juan");
        usuario1.setApellido("Pérez");
        
        usuario2.setFolio(3); //modificando datos
        
        //herencia
        Usuario_estado usuarioestado1 = new Usuario_estado("naucalpan",4,"juan","perez");
        System.out.println(usuarioestado1.getNombre());
        
        usuarioestado1.mostrarNombre();
        
        //instancio un usuario menor
        Usuario_menor usuariomenor1 = new Usuario_menor("juan",5,"pedro","perez");
        System.out.println(usuariomenor1.getTutor());
        
   
        usuariomenor1.mostrarNombre();
        
         //Modificar datos metiendolos
         Scanner entrada = new Scanner(System.in);
         System.out.println("Quieres modificar algun dato?");
         boolean si = true;
         if (si == true){
            System.out.println("Selecciona el número del dato que desead modificar: 1) Folio, 2) Nombre, 3) Apellido, 4) ?"); 
         }
        
    }
   
    
    
}
