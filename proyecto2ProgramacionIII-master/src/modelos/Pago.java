/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author yorman
 */
public class Pago {
    public static class MetodosDePago {
        public static final int PAGO_MOVIL = 1;
        public static final int EFECTIVO = 0;
    }
    
    public static class Monedas {
        public static final int DOLARES_AMERICANOS = 0;
        public static final int BOLIVARES = 1;
    }

    private long monto;
    private int moneda;
    private int metodoDePago;

    public Pago(long monto, int metodoDePago, int moneda) {
        this.monto = monto;
        this.metodoDePago = metodoDePago;
        this.moneda = moneda;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public int getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(int metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }
}
