package org.example.Logica;

/**
 * Clase que representa un comprador que compra un producto de un expendedor con una moneda.
 * @author Carlos Salinas
 */
class Comprador {
    private String sonido;
    private int vuelto;
    private GDeposito<Moneda> monedas100;
    private GDeposito<Moneda> monedas200;
    private GDeposito<Moneda> monedas300;
    private GDeposito<Moneda> monedas500;
    private GDeposito<Moneda> monedas1000;
    private GDeposito<Moneda> monedas1500;

    private GDeposito<Producto> inverntarioCocaCola;
    private GDeposito<Producto> inverntarioSprite;
    private GDeposito<Producto> inverntarioFanta;
    private GDeposito<Producto> inverntarioSuper8;
    private GDeposito<Producto> inverntarioSnickers;

    /**
     * Constructor que instancia el comprador, que simula la compra y que almacena el valor del vuelto en la variable
     * vuelto y un String caracteristico a la variable sonido, esto ultimo en caso de que la compra sea exitosa.
     * tambien instancia depositos para las monedas del propio comprador y los produtos que va adquiriendo.
     * Toma y vuelve a tirar las exepciones preestablecidas en el metodo comprarProducto de la clase Expendedor segun
     * sea el caso.
     * @param m es la moneda con la que se pretende comprar
     * @param cualProducto es una constante de la enumeracion Tipo que representa el tipo de producto que se desea.
     * @param exp referencia a una instancia de la clase Expendedor que representa un expendedor
     */
    public Comprador(Moneda m, Tipo cualProducto, Expendedor exp) throws Exepciones {
        monedas100 = new GDeposito<>();
        monedas200 = new GDeposito<>();
        monedas300 = new GDeposito<>();
        monedas500 = new GDeposito<>();
        monedas1000 = new GDeposito<>();
        monedas1500 = new GDeposito<>();

        inverntarioCocaCola = new GDeposito<>();
        inverntarioFanta = new GDeposito<>();
        inverntarioSprite = new GDeposito<>();
        inverntarioSnickers = new GDeposito<>();
        inverntarioSuper8 = new GDeposito<>();

        sonido = null;
        vuelto = 0;

        int tipo;
        if(cualProducto==null){tipo = 0;}
        else {tipo = cualProducto.getTipo();}

        try{
            Producto p = exp.comprarProducto(m,tipo);
            if(p!=null){
                sonido = p.consumir();
                if(sonido == "cocacola"){inverntarioSprite.add(p);}
                if(sonido == "sprite"){inverntarioSprite.add(p);}
                if(sonido == "fanta"){inverntarioSprite.add(p);}
                if(sonido == "super8"){inverntarioSprite.add(p);}
                if(sonido == "snickers"){inverntarioSprite.add(p);}

                while (true) {
                    Moneda aux_vuelto = exp.getVuelto();

                    if (aux_vuelto != null) {
                        vuelto = vuelto + aux_vuelto.getValor();
                    }

                    else {
                        break;
                    }
                }
            }

            else {
                while (true) {
                    Moneda aux_vuelto = exp.getVuelto();

                    if (aux_vuelto != null) {
                        monedas100.add(aux_vuelto);
                        vuelto = vuelto + aux_vuelto.getValor();
                    } else {
                        break;
                    }

                }
            }
        }
        catch (Exepciones e){
            if (e instanceof PagoIncorrectoException) {
                throw new PagoIncorrectoException();
            } else if (e instanceof NoHayProductoException) {
                throw new NoHayProductoException();
            } else if (e instanceof PagoInsuficienteException) {
                throw new PagoInsuficienteException();
            }
        }
    }

    /** */

    /**
     * Retorna el valor del vuelto asociado a la compra
     * @return vuelto es el valor del vuelto asociado a la compra.
     */
    public int cuantoVuelto()
    {
        return vuelto;
    }

    /**
     * Retorna un String caracteristico del producto comprado en caso de que la compra sea exitosa
     * @return sonido es el String asosiado al producto comprado cuando la compra es exitosa.
     */
    public String queConsumiste() {
        return sonido;
    }

    /**Metodo que describe a la clase Comprador.
     * @return un String que describe de la clase*/
    @Override
    public String toString() {
        return "Clase que representa un comprador";
    }
}