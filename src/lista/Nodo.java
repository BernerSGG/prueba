/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author Berner Garcia
 */
public class Nodo {
    Persona persona;
    Nodo siguiente;

    public Nodo(Persona persona) {
        this.persona = persona;
        this.siguiente = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}