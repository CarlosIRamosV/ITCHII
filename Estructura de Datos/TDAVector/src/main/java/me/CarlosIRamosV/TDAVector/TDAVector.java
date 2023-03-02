package me.CarlosIRamosV.TDAVector;

import me.CarlosIRamosV.TDAVector.interfaces.TDAVectorInterface;

import java.util.Arrays;
import java.util.Vector;

/**
 * Clase que implementa el TDA Vector
 *
 * @author Carlos Ramos
 * @version 1.0
 * @see TDAVectorInterface
 */
@SuppressWarnings({"NonAsciiCharacters", "unused", "DuplicatedCode"})
public class TDAVector implements TDAVectorInterface {
    int[] vector;
    int numElem;

    /**
     * Constructor por defecto de la clase TDAVector
     */
    TDAVector() {
        vector = new int[32];
        numElem = 0;
    }

    /**
     * Constructor de la clase TDAVector que recibe el tamaño del vector
     *
     * @param tamaño Tamaño del vector
     */
    TDAVector(int tamaño) {
        vector = new int[tamaño];
        numElem = 0;
    }

    /**
     * Agrega un elemento al final del vector
     *
     * @param elemento Elemento a agregar
     * @return true si se agrego el elemento, false si no se pudo agregar
     */
    @Override
    public boolean agregarElementoFinal(int elemento) {
        if (numElem < vector.length) {
            vector[numElem] = elemento;
            numElem++;
            return true;
        }
        return false;
    }

    /**
     * Elimina el último elemento del vector
     *
     * @return true si se elimino el elemento, false si no se pudo eliminar
     */
    @Override
    public boolean eliminarElementoFinal() {
        if (numElem > 0) {
            numElem--;
            return true;
        }
        return false;
    }

    /**
     * Inserta un elemento en el vector de forma ordenada (ascendente)
     *
     * @param elemento Elemento a insertar
     * @return true si se inserto el elemento, false si no se pudo insertar
     */
    @Override
    public boolean insertarElemento(int elemento) {
        if (numElem < vector.length) {
            int position = 0;
            while (position < numElem && vector[position] < elemento) position++;
            for (int i = numElem; i > position; i--)
                vector[i] = vector[i - 1];
            vector[position] = elemento;
            numElem++;
            return true;
        }
        return false;
    }

    /**
     * Elimina un elemento del vector
     *
     * @param elemento Elemento a eliminar
     * @return true si se elimino el elemento, false si no se pudo eliminar
     */
    @Override
    public boolean eliminarElemento(int elemento) {
        int position = 0;
        while (position < numElem && vector[position] != elemento) {
            position++;
        }
        if (position < numElem) {
            for (int i = position; i < numElem - 1; i++)
                vector[i] = vector[i + 1];
            numElem--;
            return true;
        }
        return false;
    }

    /**
     * Obtener el vector almacenado
     *
     * @return Vector almacenado en forma de arreglo
     */
    @Override
    public String getVector() {
        return Arrays.toString(Arrays.copyOf(vector, numElem));
    }

    /**
     * Ordena el vector de forma ascendente
     */
    @Override
    public void burbuja() {
        int aux;
        for (int i = 0; i < numElem - 1; i++) {
            for (int j = 0; j < numElem - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    /**
     * Ordena el vector de forma descendente
     */
    @Override
    public void burbujaInvertido() {
        int aux;
        for (int i = 0; i < numElem - 1; i++) {
            for (int j = 0; j < numElem - 1; j++) {
                if (vector[j] < vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    /**
     * Ordena el vector de forma ascendente de forma más eficiente
     */
    @Override
    public void shell() {
        int intervalo, i, j, k, aux;
        intervalo = numElem / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < numElem; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (vector[j] <= vector[k]) {
                        j = -1;
                    } else {
                        aux = vector[j];
                        vector[j] = vector[k];
                        vector[k] = aux;
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    /**
     * Ordena el vector de forma descendente de forma más eficiente
     */
    @Override
    public void shellInvertido() {
        int intervalo, i, j, k, aux;
        intervalo = numElem / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < numElem; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (vector[j] >= vector[k]) {
                        j = -1;
                    } else {
                        aux = vector[j];
                        vector[j] = vector[k];
                        vector[k] = aux;
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    /**
     * Ordena el vector de forma más eficiente mediante el algoritmo de ordenamiento QuickSort
     */
    private void qS(byte primero, byte ultimo) {
        byte i = primero, j = ultimo;
        int pivote = vector[(primero + ultimo) / 2];
        int aux;
        System.out.println("primero: "+ i + " ultimo:" + j + " pivote:" + pivote);
        System.out.println(Arrays.toString(vector));

        do {
            while (vector[i] < pivote) i++;
            while (vector[j] > pivote) j--;
            if (i <= j) {
                System.out.println("i: "+ i + " j:" + j);
                System.out.println("Antes: " + Arrays.toString(vector));
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
                System.out.println("Despues: " + Arrays.toString(vector));
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) qS(primero, j);
        if (i < ultimo) qS(i, ultimo);
    }

    public boolean quickSort() {
        if (numElem > 0) {
            qS((byte) 0, (byte) (numElem - 1));
            return true;
        } else return false;
    }

    /**
     * Busca las posiciones donde se encuentra cierto número
     *
     * @param elemento numero entero a buscar
     * @return posiciones donde se encuentra el elemento
     */
    @Override
    public String buscarElemento(int elemento) {
        StringBuilder posiciones = new StringBuilder("[");
        boolean started = false;
        for (int i = 0; i < numElem; i++) {
            if (vector[i] == elemento) {
                if (started) posiciones.append(", ");
                else started = true;
                posiciones.append(i);
            }
        }
        posiciones.append("]");
        return posiciones.toString();
    }

    public int buscarElementoMetodo1(int elemento) {
        for (int i = 0; i < numElem; i++) {
            if (vector[i] == elemento) return i;
        }
        return -1;
    }

    public int buscarElementoMetodo2(int elemento) {
        int position = 0;
        for (int i = 0; i < numElem; i++) {
            if (vector[i] == elemento) position = i;
        }
        return position;
    }

    public int buscarElementoMetodo3(int elemento) {
        boolean encontrado = false;
        int pos = 0;
        while (pos < numElem && !encontrado) {
            if (vector[pos] == elemento) encontrado = true;
            else pos++;
        }
        if (encontrado) return pos;
        else return -1;
    }

    public boolean eliminarPrimerElemento() {
        if (numElem > 0) {
            for (int i = 0; i < (numElem - 1); i++)
                vector[i] = vector[i + 1];
            numElem--;
            return true;
        }
        return false;
    }

    public boolean agregarPrimerElemento(int elemento) {
        if (numElem < vector.length) {
            for (int i = numElem; i > 0; i--)
                vector[i] = vector[i - 1];
            vector[0] = elemento;
            numElem++;
            return true;
        }
        return false;
    }
}