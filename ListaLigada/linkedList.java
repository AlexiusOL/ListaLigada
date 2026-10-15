/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaLigada;

/**
 *
 * @author alexis
 */
public class linkedList {
    // Atributos de la linked list
    private Node head;
    private Node tail;
    private int length;
    // Nodos con su constructor
    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    
    //Constructor de la lista ligada con nodo inicial
    public linkedList (int value) {
        Node newNode=new Node(value);
        length = 1;
        head = newNode;
        tail = newNode;
    }
    // Getters
    public void getHead() {
        System.out.println("Head:" + head.value);
    }
    public void getTail() {
        System.out.println("Tail:" + tail.value);
    }
    public void getLength() {
            System.out.println("Length:" + length);
    }
    
    // Metodo append para un nuevo nodo al final de la lista
    public void append(int value) {
        if(length == 0){
            Node newNode = new Node(value);
            length = 1;
            head = newNode;
            tail = newNode;
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }
    
    //Metodo para imprimir toda la lista
    public void printList(){
        Node temp = head;
        System.out.print("  ");
        while(temp != null){
            
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    // Metodo para eliminar el último elemento de la lista
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    
    // Metodo para borrar el primer nodo de la lista que lo devuelve
    public Node removeFirst() {
        Node nodo = head;
        if(length == 0) {
            return null;
        }
        if(length == 1) {
            head = null;
            tail = null;
        }
        head = head.next;
        length--;
        return nodo;
    }
    
    
    // Método para insertar un nodo por indice
    public boolean insert(int value, int index) {     
        //validacion del indice
        if(index < 0 || index > length) {
            return false;
        }
        if(index == 0) {prepend(value); return true;}
        if(index == length) {append(value); return true;}

        Node newNode = new Node(value);

        
        Node pre = head;
        for(int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
        newNode.next = pre.next;
        pre.next = newNode;
        
        
        length++;
        return true;
    }
    
    // Metodo para borrar un nodo por índice que lo devuelve
    public Node remove(int index) {
        // Validacion del indice
        if(index < 0 || index > length) {
            return null;
        }
        
        if(index == length) {
            return removeLast();
        }
        if(index == 0) {
            return removeFirst();
        }
        
        Node borrado;
       
        
        Node pre = head;
        for(int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
        borrado = pre.next;

        pre.next = borrado.next;
        

        length--;
        return borrado;
    }
    
    // Metodo para encontrar el nodo de en medio usando dos punteros
    public Node medio() {
        Node puntero1 = head;
        Node puntero2 = head;
        //Un puntero avanza de uno en uno y el otro de dos en dos hasta que llegue al final
        while(puntero2 != null && puntero2.next != null) {
            
            puntero1 = puntero1.next;
            
            puntero2 = puntero2.next.next;
        }
        return puntero1;
    }
    
    // Metodo para ver si la lista se cicla o no, usando dos punteros
    public boolean ciclo() {
        Node puntero1 = head;
        Node puntero2 = head;
        if(head == null || head.next == null) {
            return false;
        }
        // Se usa la misma logica que en el de medio, pero aqui si en algun punto ambos punteros coinciden
        // entonces la lista se cicla
        while(puntero2 != null && puntero2.next != null) {
            puntero1 = puntero1.next;
            puntero2 = puntero2.next.next;
            
            if(puntero1 == puntero2) {
                return true;
            }
        }
        return false;
        
    }
    // Metodo para revertir la lista usando tres punteros   
    public void reverse() {
        
        Node pre = null;
        Node act = head;
        Node sigui = null;
        
        while(act != null) {            
            sigui = act.next;
          
            act.next = pre;           
            pre = act;
            act = sigui;
        }
        head = pre;
    }
    //Metodo getnode que regresa un nodo dado su indice
    public Node getNode(int index) {
        if(index < 0 || index > length) {
            return null;
        }

        Node nodo = head;
        for(int i = 0; i < index; i++) {
            nodo = nodo.next;
        }
        
        
        return nodo;
    }
    
    // Metodo setNode que cambia el valor de un nodo dado el indice
    public void setNode(int value, int index) {
        Node nodo = getNode(index);
        
        if(nodo != null) 
            nodo.value = value;
        
    }
    
    // Metodo prepend que añade un nuevo nodo al inicio de la lista
    public void prepend(int value) {
        Node newNode = new Node(value);
        
        if(length== 0) {
            head = newNode;
            tail = newNode;
            
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        
        
        length++;
        
    }
}
