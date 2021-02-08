package Coin;


/**
 * Clase que modela el objeto moneda (Coin)
 *
 * @author Cristhian C
 */
public class Coin {
    private int coinValue;
    
    /**
     * Constructor de la clase.
     *
     */
    public Coin() {
        
    }
    
    /**
     * Constructor de la clase.
     *
     * @param coinValue valor de la moneda.
     */
    public Coin(int coinValue) {
        this.coinValue = coinValue;
    }

    
    /**
     * Método que obtiene el valor de la moneda.
     * @return Valor de la moneda.
     */
    public int getCoinValue() {
        return (coinValue);
    }

    
    /**
     * Método que estalbece el valor de la moneda.
     * @param coinValue Valor de la moneda.
     */
    public void setCoinValue(int coinValue) {
        this.coinValue = coinValue;
    }
    
    

}
