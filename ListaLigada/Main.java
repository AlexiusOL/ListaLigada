package ListaLigada;

/**
 *
 * @author alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando objeto de la lista ligada
        linkedList ll=new linkedList(10);
        // Usando el append
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        System.out.println("Lista inicial");
        ll.printList();
        //Probando los getters
        System.out.println("Datos adicionales:");
        ll.getHead();
        ll.getTail();
        ll.getLength();
        System.out.println("Probando remove 50: " + ll.removeLast().value);
        System.out.println("Probando remove 40: " + ll.removeLast().value);
        System.out.println("Probando remove 30: " + ll.removeLast().value);
        System.out.println("Probando remove 20: " + ll.removeLast().value);
        System.out.println("Probando remove 10: " + ll.removeLast().value);
                
       
        System.out.println("Probando remove vacio");
        System.out.println( ll.removeLast() );
       
        ll.append(100);
        System.out.println("Imprime lista con 100");
        ll.printList();
        ll.append(200);
        ll.append(300);
        ll.append(400);
        ll.append(440);
        ll.append(1010);
        
        System.out.println("Imprime lista con 100, 200, 300, 400, 440 y 1010:");
        ll.printList();
        
  
        //Probando setnode
        ll.setNode(50, 1);
        ll.setNode(707, 2);
        ll.setNode(67, 4);
        
        System.out.println("Probando setNode con 50 en indice 1, 707 en indice 2 y 67 en indice 4:");
        ll.printList();
        
        //Probando getnode
        System.out.println("Probando getNode:");
        System.out.println("  Nodo posicion 0: " + ll.getNode(0).value);
        System.out.println("  Nodo posicion 3: " + ll.getNode(3).value);
        System.out.println("  Nodo posicion 5: " + ll.getNode(5).value);
        
        // Probando prepend
        System.out.println("Probando prepend 900, 350, 15 y 50:");
        ll.prepend(900);
        ll.prepend(350);
        ll.prepend(15);
        ll.prepend(50);
        ll.printList();
        
        //Probando los removes
        System.out.println("Probando remove(indice):");
        ll.remove(3);
        ll.printList();
        
        
        System.out.println("Probando removeFirst");
        System.out.println("Se borró: " + ll.removeFirst().value + ", la lista ahora es: ");
        ll.printList();
        
        System.out.println("Probando removeLast");
        System.out.println("Se borró: " + ll.removeLast().value + ", la lista ahora es: ");
        
  
        ll.printList();
        
        //Probando el insert con indice
        System.out.println("Probando insert");
        ll.insert(44, 4);
        ll.insert(55, 5);
        ll.printList();
        
        // Ver elemento de en medio
        System.out.println("Imprimiendo el elemento del medio");
        System.out.println(" "+ ll.medio().value);
        
        //Revertir lista
        System.out.println("Imprimiendo la lista invertida");
        ll.reverse();
        ll.printList();
        
        //Ver si esta ciclada
        System.out.println("Probando metodo para ver si la lista esta ciclada");
        System.out.println("Ciclada: " + ll.ciclo());
        
 
        
        
    }
    
}
