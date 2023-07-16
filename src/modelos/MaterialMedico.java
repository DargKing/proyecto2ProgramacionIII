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
public class MaterialMedico {
    private int id;
    private String codigo;
    private String nombreMaterial;
    private String descripcion;
    private int cantidad;

    public MaterialMedico(int id, String codigo, String nombreMaterial, String descripcion, int cantidad) {
        this.id = id;
        this.codigo = codigo;
        this.nombreMaterial = nombreMaterial;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    
    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMateria) {
        this.nombreMaterial = nombreMateria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
