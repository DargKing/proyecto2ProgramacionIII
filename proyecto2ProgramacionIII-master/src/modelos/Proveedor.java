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
public class Proveedor {
    private int id;
    private String rifProveedor;
    private String nombreProveedor;
    private String materialesQueSuministra;
    private String numeroDeTelefono;
    private String correoElectronico;
    private String direccion;

    public Proveedor(int id, String rifProveedor, String nombreProveedor, String materialesQueSuministra, String numeroDeTelefono, String correoElectronico, String direccion) {
        this.id = id;
        this.rifProveedor = rifProveedor;
        this.nombreProveedor = nombreProveedor;
        this.materialesQueSuministra = materialesQueSuministra;
        this.numeroDeTelefono = numeroDeTelefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRifProveedor() {
        return rifProveedor;
    }

    public void setRifProveedor(String rifProveedor) {
        this.rifProveedor = rifProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getMaterialesQueSuministra() {
        return materialesQueSuministra;
    }

    public void setMaterialesQueSuministra(String materialesQueSuministra) {
        this.materialesQueSuministra = materialesQueSuministra;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
