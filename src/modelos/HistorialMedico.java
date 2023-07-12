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
public class HistorialMedico {
    private String alergias;
    private String antecedentesMedicosGenerales;
    private String antecedentesOftalmologicos;
    private String tratamientosOftalmologicosPrevios;
    private String lentesCorrectivosPrevios;
    private int[] idCitasPrevias;

    public HistorialMedico(String alergias, String antecedentesMedicosGenerales, String antecedentesOftalmologicos, String tratamientosOftalmologicosPrevios, String lentesCorrectivosPrevios, int[] idCitasPrevias) {
        this.alergias = alergias;
        this.antecedentesMedicosGenerales = antecedentesMedicosGenerales;
        this.antecedentesOftalmologicos = antecedentesOftalmologicos;
        this.tratamientosOftalmologicosPrevios = tratamientosOftalmologicosPrevios;
        this.lentesCorrectivosPrevios = lentesCorrectivosPrevios;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAntecedentesMedicosGenerales() {
        return antecedentesMedicosGenerales;
    }

    public void setAntecedentesMedicosGenerales(String antecedentesMedicosGenerales) {
        this.antecedentesMedicosGenerales = antecedentesMedicosGenerales;
    }

    public String getAntecedentesOftalmologicos() {
        return antecedentesOftalmologicos;
    }

    public void setAntecedentesOftalmologicos(String antecedentesOftalmologicos) {
        this.antecedentesOftalmologicos = antecedentesOftalmologicos;
    }

    public String getTratamientosOftalmologicosPrevios() {
        return tratamientosOftalmologicosPrevios;
    }

    public void setTratamientosOftalmologicosPrevios(String tratamientosOftalmologicosPrevios) {
        this.tratamientosOftalmologicosPrevios = tratamientosOftalmologicosPrevios;
    }

    public String getLentesCorrectivosPrevios() {
        return lentesCorrectivosPrevios;
    }

    public void setLentesCorrectivosPrevios(String lentesCorrectivosPrevios) {
        this.lentesCorrectivosPrevios = lentesCorrectivosPrevios;
    }

    public int[] getIdCitasPrevias() {
        return idCitasPrevias;
    }

    public void setIdCitasPrevias(int[] idCitasPrevias) {
        this.idCitasPrevias = idCitasPrevias;
    }

    
}
