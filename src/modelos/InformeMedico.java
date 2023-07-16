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
public class InformeMedico {
    
    private String dignostico;
    private String tratamiento;
    private String medicamentos;
    private String examenOcular;

    public InformeMedico(String dignostico, String tratamiento, String medicamentos, String examenOcular) {
        this.dignostico = dignostico;
        this.tratamiento = tratamiento;
        this.medicamentos = medicamentos;
        this.examenOcular = examenOcular;
    }
    
    public InformeMedico(){
        this.dignostico = "";
        this.tratamiento = "";
        this.medicamentos = "";
        this.examenOcular = "";
    }

    public String getDignostico() {
        return dignostico;
    }

    public void setDignostico(String dignostico) {
        this.dignostico = dignostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getExamenOcular() {
        return examenOcular;
    }

    public void setExamenOcular(String examenOcular) {
        this.examenOcular = examenOcular;
    }
}
