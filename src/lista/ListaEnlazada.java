/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import javax.swing.JOptionPane;

/**
 *
 * @author Berner Garcia
 */
public class ListaEnlazada {
    private Nodo cabeza;

    public void agregarInicio(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }
    
    public void agregarMedio(Persona persona, int posicion) {
    if (posicion <= 0 || posicion > obtenerTamanio() + 1) {
        JOptionPane.showMessageDialog(null, "Posición inválida. La posición debe estar entre 1 y " + (obtenerTamanio() + 1), "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Nodo nuevoNodo = new Nodo(persona);
    if (posicion == 1) {
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    } else {
        Nodo actual = cabeza;
        int contador = 1;
        while (contador < posicion - 1) {
            actual = actual.siguiente;
            contador++;
        }
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
    }
}

public int obtenerTamanio() {
    Nodo actual = cabeza;
    int contador = 0;
    while (actual != null) {
        contador++;
        actual = actual.siguiente;
    }
    return contador;
}

    public void agregarFinal(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public String mostrarLista() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        int numero = 1; // Inicializar el número de la lista
        while (actual != null) {
            sb.append(numero).append(". ").append(actual.persona.toString()).append("\n");
            actual = actual.siguiente;
            numero++; // Incrementar el número de la lista para la siguiente persona
        }
        return sb.toString();
    }
}



