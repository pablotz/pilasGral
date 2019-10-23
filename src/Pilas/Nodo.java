/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author pablo
 * @param <t>
 */
public class Nodo<t> {
    public t elemento;
    public Nodo<t> siguiente;

    public t getElemento() {
        return elemento;
    }

    public void setElemento(t elemento) {
        this.elemento = elemento;
    }

    public Nodo<t> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public Nodo(t dato, Nodo<t> siguiente){
        this.elemento = dato;
        this.siguiente = siguiente;
    }

 
    
    
    
}
