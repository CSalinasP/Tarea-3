package org.example.Logica;
/**
 * Clase que representa una moneda particular: Moneda de 200 pesos.
 * Hereda de la clase abstracta moneda y establece como se consume.
 * @author Carlos Salinas
 */
class Moneda200 extends Moneda
{
    /**Constructor por defecto de la clase Moneda200*/
    public Moneda200() {}

    /**
     * Retorna el numero de serie de la Moneda.
     * @return la instancia del objeto actual.
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     *@return 100 el valor de la moneda.
     */
    public int getValor() {
        return 200;
    }
}