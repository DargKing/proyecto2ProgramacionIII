/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.componentes;

import modelos.*;
/**
 *
 * @author yorman
 */
public class HeaderCita extends javax.swing.JPanel {

    public HeaderCita() {
        initComponents();
    }
    
    /**
     * Creates new form HeaderCita
     */
    public HeaderCita(Cita cita) {
        initComponents();
        
        this.fecha.setText(cita.getFecha());
        this.hora.setText(cita.getHora());
        this.id.setText(Integer.toString(cita.getId()));
        this.completada.setText(((cita.isCompletada()) ? "SI": "NO"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        completada = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 120));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Fecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(fecha)
                .addGap(10, 10, 10))
        );

        add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 120));

        hora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("Hora");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(hora)
                .addGap(10, 10, 10))
        );

        add(jPanel3);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 120));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("ID");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(id)
                .addGap(10, 10, 10))
        );

        add(jPanel6);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 120));

        completada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        completada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completada.setText("Completada");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(completada, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(completada)
                .addGap(10, 10, 10))
        );

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel completada;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
