package org.example.Logica;

/**
 * Clase que representa una bebida particular: Sprite.
 * Hereda de la clase abstracta bebida y establece como se consume.
 * @author Carlos Salinas
 */
class Sprite extends Bebida {

    /**
     * Constructor que crea una Sprite con un numero de serie dado.
     *@param numSerie numero de serie unico de la Sprite..
     */
    public Sprite(int numSerie) {
        super(numSerie);
    }

    /**
     * Retorna el numero de serie de la bebida.
     *
     * @return el número de serie.
     */
    public int getSerie() {
        return super.getSerie();
    }

    /**
     * Describe cómo se consume la Sprite.
     * @return un String que  representa la accion de consumir la Sprite".
     */
    public String consumir() {
        return "sprite";
    }

    /**Metodo que describe a la clase Sprite.
     * @return un String que describe de la clase*/
    @Override
    public String toString() {
        return "Clase que representa una bebida: "+this.consumir()+" con numero de serie: "+super.toString();
    }
}