package org.example.Logica;

/**
 * Clase que representa una moneda particular: Moneda de 1000 pesos.
 * Hereda de la clase abstracta moneda y establece como se consume.
 * @author Carlos Salinas
 */
class Moneda1000 extends Moneda
{

    /**Constructor por defecto de la clase Moneda1000*/
    public Moneda1000()
    {

    }

    /**
     * Retorna el numero de serie de la Moneda.
     *
     * @return la instancia del objeto actual.
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     *@return 1000 el valor de la moneda.
     */
    public int getValor()
    {
        return 1000;
    }

    /**Metodo que describe a la clase Moneda1000.
     * @return un String que describe de la clase*/
    @Override
    public String toString() {
        return "Clase que representa una moneda con valor: "+this.getValor()+" y numero de serie: " + super.toString();
    }
}
