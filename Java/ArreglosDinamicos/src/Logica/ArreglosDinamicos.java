
package Logica;

/**
 *
 * @author PILARES
 */
public class ArreglosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String>listaEnlazada = new LinkedList<>();
        
        //Agregarle elementos
    listaEnlazada.add("Phyton");
    listaEnlazada.add("Java");
    listaEnlazada.add("Javascript");
    listaEnlazada.add(3, "Ruby");
    System.out.println("Lista Enlazada" + );
    //Imprimo solo el de la posicion 1
    listaEnlazada.get(1);
    //modifico posicion 1
    listaEnlazada.set(1, "HTML");
    System.out.println(listaEnlazada.get (1) );
    //elimino posision 1
    listaEnlazada.remove(1);
    System.out.println(listaEnlazada.size());
    }
    
}
