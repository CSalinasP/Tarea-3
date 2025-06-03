package org.example.Logica;

/**
 * Clase abstracta que representa una moneda y que implementa la interfaz Comparable
 * @author Carlos Salinas
 */
abstract class Moneda implements Comparable<Moneda> {
    /**Constructor por defecto de la superclase Moneda*/
    public Moneda() {}

    /**
     * Retorna el numero de serie de la Moneda.
     * @return la instancia del objeto actual.
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     * Metodo abstracto que retorna el valor de la moneda.
     * @return un numero entero que corresponde al valor de la moneda.
     */
    abstract public int getValor();

   /**
    * Metodo de la interfaz comparable para comparar objetos.
    * En este caso se usa para comparar monedas por su valor.
    * @param m es la moneda con la cual se quiere comparar la moneda actual.
    */
   @Override
   public int compareTo(Moneda m){
       if(this.getValor()>m.getValor()){
           return 1;
       }
       else if(this.getValor()<m.getValor()){
           return -1;
       }
       else{return 0;}
   }
}