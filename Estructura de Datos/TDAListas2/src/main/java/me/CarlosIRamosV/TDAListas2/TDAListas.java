package me.CarlosIRamosV.TDAListas2;

import me.CarlosIRamosV.TDAListas2.interfaces.TDAListasInterface;

/**
 * Clase que implementa el TDA Listas
 *
 * @author Carlos Ramos
 * @version 1.0
 * @see TDAListasInterface
 */
@SuppressWarnings({"NonAsciiCharacters", "unused", "DuplicatedCode"})
public class TDAListas implements TDAListasInterface {
    private Nodo inicio;

    public TDAListas() {
        setInicio(null);
    }

    public TDAListas(Nodo inicio) {
        setInicio(inicio);
    }

    public TDAListas(Nodo inicio, Nodo aux) {
        setInicio(inicio);
    }

    @Override
    public Nodo getInicio() {
        return inicio;
    }

    @Override
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    @Override
    public void agregarInicio(int info) {
        if (getInicio() == null) {
            setInicio(new Nodo(info));
        } else {
            setInicio(new Nodo(info, getInicio()));
            inicio.getSiguiente().setAnterior(inicio);
        }
    }

    @Override
    public void agregarFinal(int info) {

        if (getInicio() == null) {
            setInicio(new Nodo(info));
        } else {
            Nodo aux = getInicio();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(new Nodo(info));
            inicio.setAnterior(aux);
        }
    }

    @Override
    public void eliminarFinal() {
        if (getInicio() != null) {
            if (getInicio().getSiguiente() == null) {
                setInicio(null);
            } else {
                Nodo aux = getInicio();
                while (aux.getSiguiente().getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
            }
            System.gc();
        }
    }

    @Override
    public void eliminarInicio() {
        if (getInicio() != null) {
            if (getInicio().getSiguiente() == null) {
                setInicio(null);
            } else {
                setInicio(getInicio().getSiguiente());
            }
            System.gc();
        }
    }

    @Override
    public String getLista() {
        if (inicio != null) {
            Nodo aux = getInicio();
            StringBuilder lista = new StringBuilder("Lista: ");
            while (aux != null) {
                lista.append(aux.getInfo());
                if (aux.getSiguiente() != null)
                    lista.append(", ");
                aux = aux.getSiguiente();
            }
            return lista.toString();
        }
        return "Lista vaciá";
    }

    public String getElementosInvertido() {
        if (inicio != null) {
            Nodo aux = getInicio();
            StringBuilder lista = new StringBuilder("Lista: ");
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            while (aux != null) {
                lista.append(aux.getInfo());
                if (aux.getAnterior() != null)
                    lista.append(", ");
                aux = aux.getAnterior();
            }
            return lista.toString();
        }
        return "Lista vaciá";
    }

    @Override
    public int contarNodos() {
        if (getInicio() != null) {
            Nodo aux = getInicio();
            int tamaño = 0;
            while (aux != null) {
                tamaño++;
                aux = aux.getSiguiente();
            }
            return tamaño;
        }
        return 0;
    }

    @Override
    public void buscar(int dato) {
        if (getInicio() != null) {
            Nodo aux = getInicio();
            int posicion = 0;
            while (aux != null) {
                if (aux.getInfo() == dato) {
                    System.out.println("El dato " + dato + " se encuentra en la posición " + posicion);
                    return;
                }
                posicion++;
                aux = aux.getSiguiente();
            }
            System.out.println("El dato " + dato + " no se encuentra en la lista");
        }
    }
}