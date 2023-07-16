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
public class Factura {
    private int id;
    private String examenes;
    private Pago pago;
    private String fechaEmision;
    private boolean pagado;

    public Factura(int id, String examenes, Pago pago, String fechaEmision, boolean pagado) {
        this.id = id;
        this.examenes = examenes;
        this.pago = pago;
        this.fechaEmision = fechaEmision;
        this.pagado = pagado;
    }

    public Factura(){
        this.id = -1;
        this.examenes = "";
        this.fechaEmision = "";
        this.pagado = false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

   
}
