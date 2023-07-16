/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.ControladorVentanas;
import java.awt.Color;

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
        tituloConsultorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tituloConsultorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloConsultorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloConsultorioMouseClicked(evt);
            }
        });
        opcionConsultorio.add(tituloConsultorio);

        subOpcionesConsultorio.setLayout(new javax.swing.BoxLayout(subOpcionesConsultorio, javax.swing.BoxLayout.Y_AXIS));

        actividad.setBackground(new java.awt.Color(153, 204, 255));
        actividad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        actividad.setText("<html><body style=\"margin: 3px 10px\">Actividad</body></html>");
        actividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actividad.setOpaque(true);
        actividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actividadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actividadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actividadMouseExited(evt);
            }
        });
        subOpcionesConsultorio.add(actividad);

        egresos.setBackground(new java.awt.Color(153, 204, 255));
        egresos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        egresos.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Egresos</body></html>");
        egresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        egresos.setOpaque(true);
        egresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                egresosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                egresosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                egresosMouseExited(evt);
            }
        });
        subOpcionesConsultorio.add(egresos);

        ingresos.setBackground(new java.awt.Color(153, 204, 255));
        ingresos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresos.setText("<html><body style=\"margin: 5px 10px 5px 10px\">Ingresos</body></html>");
        ingresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresos.setOpaque(true);
        ingresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresosMouseExited(evt);
            }
        });
        subOpcionesConsultorio.add(ingresos);

        opcionConsultorio.add(subOpcionesConsultorio);

        add(opcionConsultorio);

        opcionPaciente.setLayout(new javax.swing.BoxLayout(opcionPaciente, javax.swing.BoxLayout.Y_AXIS));

        tituloPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPaciente.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Paciente</body></html>");
        tituloPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tituloPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloPacienteMouseClicked(evt);
            }
        });
        opcionPaciente.add(tituloPaciente);

        subOpcionesPaciente.setLayout(new javax.swing.BoxLayout(subOpcionesPaciente, javax.swing.BoxLayout.Y_AXIS));

        cita.setBackground(new java.awt.Color(153, 204, 255));
        cita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cita.setText("<html><body style=\"margin: 3px 10px\">Cita</body></html>");
        cita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cita.setOpaque(true);
        cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                citaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                citaMouseExited(evt);
            }
        });
        subOpcionesPaciente.add(cita);

        facturas.setBackground(new java.awt.Color(153, 204, 255));
        facturas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        facturas.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Facturas</body></html>");
        facturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturas.setOpaque(true);
        facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturasMouseExited(evt);
            }
        });
        subOpcionesPaciente.add(facturas);

        historial.setBackground(new java.awt.Color(153, 204, 255));
        historial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historial.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Historial</body></html>");
        historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historial.setOpaque(true);
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historialMouseExited(evt);
            }
        });
        subOpcionesPaciente.add(historial);

        informe.setBackground(new java.awt.Color(153, 204, 255));
        informe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        informe.setText("<html><body style=\"margin: 5px 10px 5px 10px\">Informe</body></html>");
        informe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informe.setOpaque(true);
        informe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                informeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                informeMouseExited(evt);
            }
        });
        subOpcionesPaciente.add(informe);

        opcionPaciente.add(subOpcionesPaciente);

        add(opcionPaciente);

        opcionInventario.setLayout(new javax.swing.BoxLayout(opcionInventario, javax.swing.BoxLayout.Y_AXIS));

        tituloPaciente1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPaciente1.setText("<html><body style=\"margin: 5px 10px 3px 10px\">Inventario</body></html>");
        tituloPaciente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tituloPaciente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloPaciente1MouseClicked(evt);
            }
        });
        opcionInventario.add(tituloPaciente1);

        subOpcionesInventario.setLayout(new javax.swing.BoxLayout(subOpcionesInventario, javax.swing.BoxLayout.Y_AXIS));

        materialesMedicos.setBackground(new java.awt.Color(153, 204, 255));
        materialesMedicos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        materialesMedicos.setText("<html><body style=\"margin: 3px 10px\">Materiales Medicos</body></html>");
        materialesMedicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        materialesMedicos.setOpaque(true);
        materialesMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialesMedicosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                materialesMedicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                materialesMedicosMouseExited(evt);
            }
        });
        subOpcionesInventario.add(materialesMedicos);

        proveedores.setBackground(new java.awt.Color(153, 204, 255));
        proveedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proveedores.setText("<html><body style=\"margin: 5px 10px 5px 10px\">Proveedores</body></html>");
        proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proveedores.setOpaque(true);
        proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proveedoresMouseExited(evt);
            }
        });
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

    private void informeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informeMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.INFORME);
    }//GEN-LAST:event_informeMouseClicked

    private void proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.PROVEEDORES);
    }//GEN-LAST:event_proveedoresMouseClicked

    private void materialesMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialesMedicosMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.MATERIAL_MEDICO);
    }//GEN-LAST:event_materialesMedicosMouseClicked

    private void ingresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresosMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.INGRESOS);
    }//GEN-LAST:event_ingresosMouseClicked

    private void egresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egresosMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.EGRESOS);
    }//GEN-LAST:event_egresosMouseClicked

    private void actividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadMouseClicked
        // TODO add your handling code here:
        ControladorVentanas.cambiarPestañas(ventana, ControladorVentanas.idPestaña.ACTIVIDAD);
    }//GEN-LAST:event_actividadMouseClicked

    private void actividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadMouseEntered
        actividad.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_actividadMouseEntered

    private void actividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadMouseExited
       actividad.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_actividadMouseExited

    private void egresosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egresosMouseEntered
       egresos.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_egresosMouseEntered

    private void egresosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egresosMouseExited
      egresos.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_egresosMouseExited

    private void ingresosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresosMouseEntered
        ingresos.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_ingresosMouseEntered

    private void ingresosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresosMouseExited
       ingresos.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_ingresosMouseExited

    private void citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citaMouseExited
           cita.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_citaMouseExited

    private void citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citaMouseEntered
       cita.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_citaMouseEntered

    private void facturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMouseEntered
       facturas.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_facturasMouseEntered

    private void facturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMouseExited
        facturas.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_facturasMouseExited

    private void historialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseEntered
        historial.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_historialMouseEntered

    private void historialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseExited
         historial.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_historialMouseExited

    private void informeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informeMouseEntered
         informe.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_informeMouseEntered

    private void informeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informeMouseExited
          informe.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_informeMouseExited

    private void materialesMedicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialesMedicosMouseEntered
       materialesMedicos.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_materialesMedicosMouseEntered

    private void materialesMedicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialesMedicosMouseExited
        materialesMedicos.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_materialesMedicosMouseExited

    private void proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseEntered
         proveedores.setBackground(new Color(141,185,228));
    }//GEN-LAST:event_proveedoresMouseEntered

    private void proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseExited
     proveedores.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_proveedoresMouseExited

    
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
