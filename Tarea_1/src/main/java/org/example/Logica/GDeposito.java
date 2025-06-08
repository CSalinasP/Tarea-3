package org.example.Logica;
import java.util.ArrayList;

/**La clase generica Deposito simula un deposito para almacenar diferentes tipos de objetos
 * @author Francisco Arentsen
 */
public class GDeposito<T> {
    private ArrayList<T> Generico;

    /**
     * Constructor que instancia el GDeposito con la creación de un arreglo de tipo T.
     */
    public GDeposito() {
        Generico = new ArrayList<>();
    }


    /**
     * Función que ingresa los objetos en el deposito.
     * @param generico corresponde al objeto que se desea ingresar.
     */
    public void add(T generico) {
        if (generico != null) {
            Generico.add(generico);
        }
    }

    /**
     * Función que saca los objetos del deposito.
     * @return T corresponde al objeto que se extrae del deposito
     */
    public T get() {
        if (Generico.isEmpty()) {
            return null;
        }
        else {
            T aux = Generico.get(Generico.size() - 1);
            Generico.remove(Generico.size() - 1);
            return aux;
        }
    }

    /**Metodo que retorna la cantidad de elementos presentes en el deposito.
     * @return un entero que representa la cantidad de elementos presentes en el deposito.*/
    public int getTamaño(){
        return this.Generico.toArray().length;
    }

    /**Metodo que describe a la clase GDeposito.
     * @return un String que describe de la clase*/
    @Override
    public String toString() {
        return "Clase que representa un deposito generico";
    }
}