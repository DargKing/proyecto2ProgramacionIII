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
public class CompraMaterialMedico {

    private int idMaterialMedico;
    private int factura;
    private int cantidadComprada;
    private int precioIndividual;
    private int idProveedor;
    private String fechaDeCompra;
    private int monedas;

    public CompraMaterialMedico(int idMaterialMedico, int factura, int cantidadComprada, int precioIndividual, int idProveedor, String fechaDeCompra, int monedas) {
        this.idMaterialMedico = idMaterialMedico;
        this.factura = factura;
        this.cantidadComprada = cantidadComprada;
        this.precioIndividual = precioIndividual;
        this.idProveedor = idProveedor;
        this.fechaDeCompra = fechaDeCompra;
        this.monedas = monedas;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public int getIdMaterialMedico() {
        return idMaterialMedico;
    }

    public void setIdMaterialMedico(int idMaterialMedico) {
        this.idMaterialMedico = idMaterialMedico;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(int precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

}
