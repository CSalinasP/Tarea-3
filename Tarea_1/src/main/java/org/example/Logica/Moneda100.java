package org.example.Logica;

/**
 * Clase que representa una moneda particular: Moneda de 100 pesos.
 * Hereda de la clase abstracta moneda y establece como se consume.
 * @author Carlos Salinas
 */
class Moneda100 extends Moneda
{
    /**Constructor por defecto de la clase Moneda100*/
    public Moneda100() {}

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
        return 100;
    }

    @Override
    public int compareTo() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Moneda aux = (Moneda)o;
        return Integer.compare(100,aux.getValor());
    }
}