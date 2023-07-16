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
public class Cita {

    private int id;
    private int idPaciente;
    private int idFactura;
    private String fecha;
    private String hora;
    private boolean completada;
    private InformeMedico informeDeCita;
    private String razon;

    public Cita(int id, int idPaciente, String fecha, String hora, String razon) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.fecha = fecha;
        this.hora = hora;
        this.razon = razon;
        this.informeDeCita = new InformeMedico();
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void completarCita() {
        this.completada = true;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public InformeMedico getInformeDeCita() {
        return informeDeCita;
    }

    public void setInformeDeCita(InformeMedico informeDeCita) {
        this.informeDeCita = informeDeCita;
    }

}
