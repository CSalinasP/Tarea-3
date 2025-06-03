package org.example.Logica;
/**
 * Clase que representa una moneda particular: Moneda de 300 pesos.
 * Hereda de la clase abstracta moneda y establece como se consume.
 * @author Carlos Salinas
 */
class Moneda300 extends Moneda
{
    /**Constructor por defecto de la clase Moneda300*/
    public Moneda300() {}

    /**
     * Retorna el numero de serie de la Moneda.
     * @return la instancia del objeto actual.
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     *@return 300 el valor de la moneda.
     */
    public int getValor() {
        return 300;
    }
}
