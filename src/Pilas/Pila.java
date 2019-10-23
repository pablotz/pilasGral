package Pilas;

/**
 *
 * @author pablo
 * @param <t>
 */
public class Pila<t> {

    int indicador;
    Nodo<t> ultimo;

    public Pila() {
        this.indicador = 0;
        this.ultimo = null;
    }

    // Metodo SIZE
    public int size() {
        return indicador;
    }

    //  Metodo isEmpty
    public boolean isEmpty() {
        if (indicador == 0) {
            return true;
        } else {
            return false;
        }

    }

    //  Metodo Push
    public boolean push(t dato) {
        Nodo<t> aux = new Nodo<t>(dato, ultimo);
        ultimo = aux;
        this.indicador++;
        return true;
    }
    //   Metodo Peek

    public t peek() {
        if (isEmpty()) {
            return null;
        } else {
            return ultimo.getElemento();
        }
    }

    //  Metodo Pop
    public boolean pop() {
        if (isEmpty()) {
            return false;
        } else {
            Nodo<t> aux = ultimo.getSiguiente();
            indicador--;
            ultimo = aux;
            return true;
        }
    }

    //  Impresion de la pila
    @Override
    public String toString() {
        Nodo<t> aux = ultimo;
        String acum = "";
        while (aux != null) {
            acum += aux.getElemento() + ", ";
            aux = aux.getSiguiente();
        }
        return acum;
    }
}
