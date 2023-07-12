/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.ControladorVentanas;

/**
 *
 * @author yorman
 */
public class MenuSecretaria extends javax.swing.JPanel {

    VentanaPrincipal ventana;
    
    /**
     * Creates new form MenuEnfermera
     * @param ventana
     */
    public MenuSecretaria(VentanaPrincipal ventana) {
        initComponents();

        this.ventana = ventana;
        
        //this.subOpcionesConsultorio.setVisible(false);
        //this.subOpcionesInventario.setVisible(false);
        //this.subOpcionesPaciente.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionConsultorio = new javax.swing.JPanel();
        tituloConsultorio = new javax.swing.JLabel();
        subOpcionesConsultorio = new javax.swing.JPanel();
        actividad = new javax.swing.JLabel();
        egresos = new javax.swing.JLabel();
        ingresos = new javax.swing.JLabel();
        opcionPaciente = new javax.swing.JPanel();
        tituloPaciente = new javax.swing.JLabel();
        subOpcionesPaciente = new javax.swing.JPanel();
        cita = new javax.swing.JLabel();
        facturas = new javax.swing.JLabel();
        historial = new javax.swing.JLabel();
        informe = new javax.swing.JLabel();
        opcionInventario = new javax.swing.JPanel();
        tituloPaciente1 = new javax.swing.JLabel();
        subOpcionesInventario = new javax.swing.JPanel();
        materialesMedicos = new javax.swing.JLabel();
        proveedores = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(747, 220));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        opcionConsultorio.setLayout(new javax.swing.BoxLayout(opcionConsultorio, javax.swing.BoxLayout.Y_AXIS));

        tituloConsultorio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloConsultorio.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Consultorio</body></html>");
        tituloConsultorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloConsultorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloConsultorioMouseClicked(evt);
            }
        });
        opcionConsultorio.add(tituloConsultorio);

        subOpcionesConsultorio.setLayout(new javax.swing.BoxLayout(subOpcionesConsultorio, javax.swing.BoxLayout.Y_AXIS));

        actividad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        actividad.setText("<html><body style=\"margin: 3px 10px\">Actividad</body></html>");
        actividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subOpcionesConsultorio.add(actividad);

        egresos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        egresos.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Egresos</body></html>");
        egresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subOpcionesConsultorio.add(egresos);

        ingresos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresos.setText("<html><body style=\"margin: 5px 10px 5px 10px\">Ingresos</body></html>");
        ingresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subOpcionesConsultorio.add(ingresos);

        opcionConsultorio.add(subOpcionesConsultorio);

        add(opcionConsultorio);

        opcionPaciente.setLayout(new javax.swing.BoxLayout(opcionPaciente, javax.swing.BoxLayout.Y_AXIS));

        tituloPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPaciente.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Paciente</body></html>");
        tituloPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloPacienteMouseClicked(evt);
            }
        });
        opcionPaciente.add(tituloPaciente);

        subOpcionesPaciente.setLayout(new javax.swing.BoxLayout(subOpcionesPaciente, javax.swing.BoxLayout.Y_AXIS));

        cita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cita.setText("<html><body style=\"margin: 3px 10px\">Cita</body></html>");
        cita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citaMouseClicked(evt);
            }
        });
        subOpcionesPaciente.add(cita);

        facturas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        facturas.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Facturas</body></html>");
        facturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturasMouseClicked(evt);
            }
        });
        subOpcionesPaciente.add(facturas);

        historial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historial.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Historial</body></html>");
        historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialMouseClicked(evt);
            }
        });
        subOpcionesPaciente.add(historial);

        informe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        informe.setText("<html><body style=\"margin: 5px 10px 5px 10px\">Informe</body></html>");
        informe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subOpcionesPaciente.add(informe);

        opcionPaciente.add(subOpcionesPaciente);

        add(opcionPaciente);

        opcionInventario.setLayout(new javax.swing.BoxLayout(opcionInventario, javax.swing.BoxLayout.Y_AXIS));

        tituloPaciente1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPaciente1.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Inventario</body></html>");
        tituloPaciente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloPaciente1MouseClicked(evt);
            }
        });
        opcionInventario.add(tituloPaciente1);

        subOpcionesInventario.setLayout(new javax.swing.BoxLayout(subOpcionesInventario, javax.swing.BoxLayout.Y_AXIS));

        materialesMedicos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        materialesMedicos.setText("<html><body style=\"margin: 3px 10px\">Materiales Medicos</body></html>");
        materialesMedicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subOpcionesInventario.add(materialesMedicos);

        proveedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proveedores.setText("<html><body style=\"margin: 5px 10px 5px 10px\">Proveedores</body></html>");
        proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subOpcionesInventario.add(proveedores);

        opcionInventario.add(subOpcionesInventario);

        add(opcionInventario);
    }// </editor-fold>//GEN-END:initComponents

    private void tituloConsultorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloConsultorioMouseClicked
        // TODO add your handling code here:
        this.subOpcionesConsultorio.setVisible(!this.subOpcionesConsultorio.isVisible());
    }//GEN-LAST:event_tituloConsultorioMouseClicked

    private void tituloPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloPacienteMouseClicked
        // TODO add your handling code here:
        this.subOpcionesPaciente.setVisible(!this.subOpcionesPaciente.isVisible());
    }//GEN-LAST:event_tituloPacienteMouseClicked

    private void tituloPaciente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloPaciente1MouseClicked
        // TODO add your handling code here:
        this.subOpcionesInventario.setVisible(!this.subOpcionesInventario.isVisible());
    }//GEN-LAST:event_tituloPaciente1MouseClicked

    private void facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMouseClicked
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.FACTURA);
    }//GEN-LAST:event_facturasMouseClicked

    private void citaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citaMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.CITA);
    }//GEN-LAST:event_citaMouseClicked

    private void historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.HISTORIAL);
    }//GEN-LAST:event_historialMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividad;
    private javax.swing.JLabel cita;
    private javax.swing.JLabel egresos;
    private javax.swing.JLabel facturas;
    private javax.swing.JLabel historial;
    private javax.swing.JLabel informe;
    private javax.swing.JLabel ingresos;
    private javax.swing.JLabel materialesMedicos;
    private javax.swing.JPanel opcionConsultorio;
    private javax.swing.JPanel opcionInventario;
    private javax.swing.JPanel opcionPaciente;
    private javax.swing.JLabel proveedores;
    private javax.swing.JPanel subOpcionesConsultorio;
    private javax.swing.JPanel subOpcionesInventario;
    private javax.swing.JPanel subOpcionesPaciente;
    private javax.swing.JLabel tituloConsultorio;
    private javax.swing.JLabel tituloPaciente;
    private javax.swing.JLabel tituloPaciente1;
    // End of variables declaration//GEN-END:variables
}
