/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.componentes;

import modelos.Cita;
import modelos.Factura;

/**
 *
 * @author yorman
 */
public class CitasCarta extends javax.swing.JPanel {

    /**
     * Creates new form CitasCartaa
     *
     * @param cita
     */
    public CitasCarta(Cita cita, Factura factura) {
        initComponents();

        this.numeroDeFactura.setText("<html><body style='margin: 5px 10px 2px 10px'><span style='font-weight: bold'>Numero de Factura:</span> <span>" + cita.getIdFactura() + "</span></body></html>");
        this.fecha.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Fecha:</span> <span>" + cita.getFecha() + "</span></body></html>");
        this.hora.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Hora:</span> <span>" + cita.getHora() + "</span></body></html>");
        this.razon.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Razon:</span> <span>" + cita.getRazon() + "</span></body></html>");

        if (cita.isCompletada() && !factura.getExamenes().isEmpty()) {
            this.examenes.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Examenes:</span></body></html>");
            String listaExamenesTexto = "";

            String[] arrExamenes = factura.getExamenes().split("\n");

            for (int i = 0; i < arrExamenes.length; i++) {
                listaExamenesTexto += "<li>" + arrExamenes[i] + "</li>";
            }

            listaExamenes.setText("<html><body><ul>" + listaExamenesTexto + "</ul></body></html>");
        } else if (cita.isCompletada()) {
            this.examenes.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Examenes: </span> <span>No se realizaron examenes</span></body></html>");
        } else {
            this.examenes.setText("<html><body style='margin: 2px 10px 2px 10px'><span style='font-weight: bold'>Examenes: </span> <span>No se ha concretado la cita</span></body></html>");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroDeFactura = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        razon = new javax.swing.JLabel();
        examenes = new javax.swing.JLabel();
        listaExamenes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 204));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        numeroDeFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroDeFactura.setText("Numero de Factura: 1");
        add(numeroDeFactura);

        fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha.setText("Fecha: 2023-11-31");
        add(fecha);

        hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hora.setText("Hora: 10:30");
        add(hora);

        razon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        razon.setText("Razon: No puede ver");
        add(razon);

        examenes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        examenes.setText("Examenes:");
        add(examenes);

        listaExamenes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(listaExamenes);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel examenes;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel listaExamenes;
    private javax.swing.JLabel numeroDeFactura;
    private javax.swing.JLabel razon;
    // End of variables declaration//GEN-END:variables
}
