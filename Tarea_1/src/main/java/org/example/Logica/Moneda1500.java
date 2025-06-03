package org.example.Logica;

/**
 * Clase que representa una moneda particular: Moneda de 1500 pesos.
 * Hereda de la clase abstracta moneda y establece como se consume.
 * @author Carlos Salinas
 */
class Moneda1500 extends Moneda
{

    /**Constructor por defecto de la clase Moneda1500*/
    public Moneda1500()
    {}

    /**
     * Retorna el numero de serie de la Moneda.
     * @return la instancia del objeto actual.
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     *@return 1500 el valor de la moneda.
     */
    public int getValor()
    {
        return 1500;
    }
}
