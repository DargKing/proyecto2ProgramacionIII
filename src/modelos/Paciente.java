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
public class Paciente {
    private int id;
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String genero;
    private int edad;
    private HistorialMedico historial;

    public Paciente(int id, String nombre, String cedula, String direccion, String telefono, int edad, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.genero = genero;
        this.historial = new HistorialMedico();
    }
    
    public Paciente(int id, String nombre, String cedula, String direccion, String telefono, int edad, String genero, int idCita) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.genero = genero;
        this.historial = new HistorialMedico();
        int[] idCitasPrevias = new int[1];
        idCitasPrevias[0] = idCita;
        this.historial.setIdCitasPrevias(idCitasPrevias);
    }
    
    public Paciente(){
        this.id = -1;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public HistorialMedico getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
