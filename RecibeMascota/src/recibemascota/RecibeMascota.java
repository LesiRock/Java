package recibemascota;

import java.util.LinkedList;

public class RecibeMascota {

    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota ("Laika", 3, "Mestiza", 50.00, "Programa espacial soviético");
        
        //creo lista para guardar objetos
        LinkedList<Mascota>mascotas = new LinkedList<>();
        
        mascotas.add(mascota1);
        
        System.out.println("el total de mascotas es de "+ mascotas.size());
        
        
    }

}
